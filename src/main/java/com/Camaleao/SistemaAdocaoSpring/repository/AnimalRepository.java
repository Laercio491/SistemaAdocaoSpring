package com.Camaleao.SistemaAdocaoSpring.repository;

import com.Camaleao.SistemaAdocaoSpring.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    Animal findByNomeIgnoreCase(String nome);
}