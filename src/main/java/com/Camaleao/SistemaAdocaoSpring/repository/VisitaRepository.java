package com.Camaleao.SistemaAdocaoSpring.repository;

import com.Camaleao.SistemaAdocaoSpring.model.Visita;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Integer> {

}