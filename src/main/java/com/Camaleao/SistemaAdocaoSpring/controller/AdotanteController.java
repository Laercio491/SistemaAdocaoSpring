package com.Camaleao.SistemaAdocaoSpring.controller;

import com.Camaleao.SistemaAdocaoSpring.model.Adotante;
import com.Camaleao.SistemaAdocaoSpring.service.AdotanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adotantes")
public class AdotanteController {

    @Autowired
    private AdotanteService service;

    // CREATE
    @PostMapping
    public Adotante cadastrar(@RequestBody Adotante adotante) {
        return service.cadastrar(adotante);
    }

    // LISTAR
    @GetMapping
    public List<Adotante> listar() {
        return service.listar();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Adotante buscarPorId(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }
}