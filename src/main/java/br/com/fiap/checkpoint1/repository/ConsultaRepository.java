package br.com.fiap.checkpoint1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint1.model.Consulta;
import br.com.fiap.checkpoint1.model.ConsultaStatus;

@Repository
public interface ConsultaRepository
        extends JpaRepository<Consulta, Long> {

        public List<Consulta> findByStatusConsulta(ConsultaStatus statusConsulta);

}
