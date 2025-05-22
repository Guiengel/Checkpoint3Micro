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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.dto.Consulta.ConsultaRequestCreate;
import br.com.fiap.checkpoint1.dto.Consulta.ConsultaRequestUpdate;
import br.com.fiap.checkpoint1.dto.Consulta.ConsultaResponse;
import br.com.fiap.checkpoint1.model.ConsultaStatus;
import br.com.fiap.checkpoint1.service.ConsultaService;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    
    @PostMapping
    public ResponseEntity<ConsultaResponse> create(
        @RequestBody ConsultaRequestCreate dto){
            return ResponseEntity.status(201).body(
                new ConsultaResponse().toDto(
                    consultaService.createConsulta(dto)
                )
            );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        boolean result = consultaService.deleteConsulta(id);
        if(result){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConsultaResponse> update (@PathVariable Long id, @RequestBody ConsultaRequestUpdate dto){
        return consultaService.updateConsulta(id, dto)
        .map(p -> new ConsultaResponse().toDto(p))
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ConsultaResponse>>findAll(){
        List<ConsultaResponse> response =
            consultaService.getAll().stream()
            .map (p-> new ConsultaResponse().toDto(p))
            .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaResponse> getConsultaById (@PathVariable Long id){
        return consultaService.getConsultaById(id)
            .map(p -> new ConsultaResponse().toDto(p))
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping("query")
    public ResponseEntity<List<ConsultaResponse>> findByValue(@RequestParam("status")ConsultaStatus statusConsulta){
            return ResponseEntity.ok(consultaService.findByStatusConsulta(statusConsulta).stream()
            .map(consulta -> new ConsultaResponse().toDto(consulta))
            .collect(Collectors.toList()));
    }
    

}
