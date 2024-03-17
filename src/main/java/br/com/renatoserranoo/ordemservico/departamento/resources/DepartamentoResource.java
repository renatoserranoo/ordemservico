package br.com.renatoserranoo.ordemservico.departamento.resources;

import br.com.renatoserranoo.ordemservico.departamento.domain.Departamento;
import br.com.renatoserranoo.ordemservico.departamento.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departament")
public class DepartamentoResource {
    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<Departamento> criarDepartamento(@RequestBody Departamento departamento) {
        departamentoService.criarDepartamento(departamento);
        var novoDepartamento = departamentoService.criarDepartamento(departamento);
        return new ResponseEntity<>(novoDepartamento, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamento(){
        var departamentos = departamentoService.listarDepartamentos();
        return new ResponseEntity<>(departamentos, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Departamento> atualizarDepartamento(@RequestBody Departamento departamento) {
        departamentoService.criarDepartamento(departamento);
        var novoDepartamento = departamentoService.criarDepartamento(departamento);
        return new ResponseEntity<>(novoDepartamento, HttpStatus.CREATED);
    }

    @DeleteMapping("/{idDepartamento}")
    public ResponseEntity<Void> deleteDepartamento(@PathVariable Integer idDepartamento) {
        departamentoService.removerDepartamento(idDepartamento);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
