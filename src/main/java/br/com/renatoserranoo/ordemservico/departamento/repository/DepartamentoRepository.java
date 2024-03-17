package br.com.renatoserranoo.ordemservico.departamento.repository;

import br.com.renatoserranoo.ordemservico.departamento.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
