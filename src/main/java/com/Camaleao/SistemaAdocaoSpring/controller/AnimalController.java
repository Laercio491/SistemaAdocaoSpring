package com.Camaleao.SistemaAdocaoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Camaleao.SistemaAdocaoSpring.model.Animal;
import com.Camaleao.SistemaAdocaoSpring.service.AnimalService;

@RestController
@RequestMapping("/animais")
@CrossOrigin("*")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @PostMapping
    public Animal cadastrar(@RequestBody Animal animal) {

        System.out.println("CHEGOU");
        System.out.println(animal.getNome());

        return service.cadastrar(animal);
    }

    @GetMapping
    public List<Animal> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Animal buscar(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}