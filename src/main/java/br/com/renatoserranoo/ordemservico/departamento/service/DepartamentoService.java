package br.com.renatoserranoo.ordemservico.departamento.service;

import br.com.renatoserranoo.ordemservico.departamento.domain.Departamento;
import br.com.renatoserranoo.ordemservico.departamento.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public Departamento criarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<Departamento> listarDepartamentos() {
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> buscarDepartamento(Integer idDepartamento) {
        return departamentoRepository.findById(idDepartamento);
    }

    public void removerDepartamento(Integer idDepartamento) {
        departamentoRepository.deleteById(idDepartamento);
    }

}
