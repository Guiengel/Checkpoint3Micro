package br.com.fiap.checkpoint1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.dto.Consulta.ConsultaRequestCreate;
import br.com.fiap.checkpoint1.dto.Consulta.ConsultaRequestUpdate;
import br.com.fiap.checkpoint1.model.Consulta;
import br.com.fiap.checkpoint1.model.ConsultaStatus;
import br.com.fiap.checkpoint1.model.Paciente;
import br.com.fiap.checkpoint1.model.Profissional;
import br.com.fiap.checkpoint1.repository.ConsultaRepository;
import br.com.fiap.checkpoint1.repository.PacienteRepository;
import br.com.fiap.checkpoint1.repository.ProfissionalRepository;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ProfissionalRepository profissionalRepository;

        public Consulta createConsulta(ConsultaRequestCreate dto){
        Consulta consulta = new Consulta();
        consulta.setStatusConsulta(ConsultaStatus.AGENDADA);
        consulta.setData_consulta(dto.getData_consulta());

        Paciente paciente = pacienteRepository.findById(dto.getPacienteId())
            .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));

        Profissional profissional = profissionalRepository.findById(dto.getProfissionalId())
            .orElseThrow(() -> new RuntimeException("Profissional não encontrado"));

        consulta.setPaciente(paciente);
        consulta.setProfissional(profissional);
        return consultaRepository.save(consulta);
    }
    
        public Optional<Consulta> updateConsulta(
            Long id, ConsultaRequestUpdate dto) {

        return consultaRepository.findById(id)
            .map(p -> consultaRepository.save(dto.toModel(p)));
    }

    public Optional<Consulta> getConsultaById(Long id) {        
        return consultaRepository.findById(id);
    }

    public List<Consulta> getAll() {
    return consultaRepository.findAll();
    }

    public boolean deleteConsulta(Long id) { 
        if (consultaRepository.existsById(id)) {
            consultaRepository.deleteById(id);
            return true;
        }

        return false;     
    }

    public List<Consulta> findByStatusConsulta(ConsultaStatus statusConsulta){
        return consultaRepository.findByStatusConsulta(statusConsulta);
    }


}
