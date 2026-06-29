package com.Camaleao.SistemaAdocaoSpring.repository;

import com.Camaleao.SistemaAdocaoSpring.model.Adotante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdotanteRepository extends JpaRepository<Adotante, Integer> {

    // método extra opcional
    Adotante findByNomeIgnoreCase(String nome);

    Adotante findByCpf(String cpf);
}