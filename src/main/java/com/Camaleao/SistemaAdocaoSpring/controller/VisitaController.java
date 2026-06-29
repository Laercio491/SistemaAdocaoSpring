package com.Camaleao.SistemaAdocaoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Camaleao.SistemaAdocaoSpring.model.Visita;
import com.Camaleao.SistemaAdocaoSpring.service.VisitaService;

@RestController
@RequestMapping("/visitas")
@CrossOrigin("*")
public class VisitaController {


@Autowired
private VisitaService service;

@PostMapping
public Visita cadastrar(@RequestBody Visita visita) {
    return service.cadastrar(visita);
}

@GetMapping
public List<Visita> listar() {
    return service.listar();
}

}
