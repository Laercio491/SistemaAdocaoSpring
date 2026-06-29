package com.Camaleao.SistemaAdocaoSpring.service;

import com.Camaleao.SistemaAdocaoSpring.model.Adotante;
import com.Camaleao.SistemaAdocaoSpring.model.Animal;
import com.Camaleao.SistemaAdocaoSpring.model.Visita;
import com.Camaleao.SistemaAdocaoSpring.repository.VisitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitaService {

    @Autowired
    private VisitaRepository repository;

    public Visita cadastrar(Visita visita) {
        return repository.save(visita);
    }

    public List<Visita> listar() {
        return repository.findAll();
    }
}