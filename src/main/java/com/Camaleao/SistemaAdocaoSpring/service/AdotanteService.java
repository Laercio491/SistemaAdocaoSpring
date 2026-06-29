package com.Camaleao.SistemaAdocaoSpring.service;

import com.Camaleao.SistemaAdocaoSpring.model.Adotante;
import com.Camaleao.SistemaAdocaoSpring.repository.AdotanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdotanteService {

    private final AdotanteRepository repository;

    public AdotanteService(AdotanteRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Adotante cadastrar(Adotante adotante) {
        return repository.save(adotante);
    }

    // LISTAR
    public List<Adotante> listar() {
        return repository.findAll();
    }

    // BUSCAR POR ID
    public Adotante buscarPorId(int id) {
        return repository.findById(id).orElse(null);
    }

    // DELETE
    public void deletar(int id) {
        repository.deleteById(id);
    }
}