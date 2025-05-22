package br.com.fiap.checkpoint1.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.checkpoint1.dto.Profissional.ProfissionalRequestCreate;
import br.com.fiap.checkpoint1.dto.Profissional.ProfissionalRequestUpdate;
import br.com.fiap.checkpoint1.dto.Profissional.ProfissionalResponse;
import br.com.fiap.checkpoint1.service.ProfissionalService;

@RestController
@RequestMapping("profissionais")
public class ProfissionalController {
    @Autowired
    private ProfissionalService profissionalService;

    @PostMapping
    public ResponseEntity<ProfissionalResponse> create(
        @RequestBody ProfissionalRequestCreate dto){
            return ResponseEntity.status(201).body(
                new ProfissionalResponse().toDto(
                    profissionalService.createProfissional(dto)
                )
            );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        boolean result = profissionalService.deleteProfissional(id);
        if(result){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfissionalResponse> update (@PathVariable Long id, @RequestBody ProfissionalRequestUpdate dto){
        return profissionalService.updateProfissional(id, dto)
        .map(p -> new ProfissionalResponse().toDto(p))
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ProfissionalResponse>>findAll(){
        List<ProfissionalResponse> response =
            profissionalService.getAll().stream()
            .map (p-> new ProfissionalResponse().toDto(p))
            .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfissionalResponse> getProfissionalById (@PathVariable Long id){
        return profissionalService.getProfissionalById(id)
            .map(p -> new ProfissionalResponse().toDto(p))
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
}
