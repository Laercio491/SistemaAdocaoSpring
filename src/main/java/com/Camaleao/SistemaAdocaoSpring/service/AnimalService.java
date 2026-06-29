package com.Camaleao.SistemaAdocaoSpring.service;

import com.Camaleao.SistemaAdocaoSpring.model.Animal;
import com.Camaleao.SistemaAdocaoSpring.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Animal cadastrar(Animal animal) {
        return repository.save(animal);
    }

    // LISTAR
    public List<Animal> listar() {
        return repository.findAll();
    }

    // BUSCAR POR ID
    public Animal buscarPorId(int idAnimal) {
        return repository.findById(idAnimal).orElse(null);
    }

    // DELETE
    public void deletar(int idAnimal) {
        repository.deleteById(idAnimal);
    }
}