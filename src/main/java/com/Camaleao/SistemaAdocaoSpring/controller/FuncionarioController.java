package com.Camaleao.SistemaAdocaoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Camaleao.SistemaAdocaoSpring.model.Funcionario;
import com.Camaleao.SistemaAdocaoSpring.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @PostMapping
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        return service.cadastrar(funcionario);
    }

    @GetMapping
    public List<Funcionario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Funcionario buscar(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    @GetMapping("/cpf/{cpf}")
    public Funcionario buscarCpf(@PathVariable String cpf) {
        return service.buscarPorCpf(cpf);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }
}