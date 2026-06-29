package com.Camaleao.SistemaAdocaoSpring.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visita")
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVisitas;

    private LocalDate dataVisita;

    @ManyToOne
    @JoinColumn(name = "idAnimal")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "idadotante")
    private Adotante adotante;

    public Visita() {
    }

    public Integer getIdVisitas() {
        return idVisitas;
    }

    public void setIdVisitas(Integer idVisitas) {
        this.idVisitas = idVisitas;
    }

    public LocalDate getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(LocalDate dataVisita) {
        this.dataVisita = dataVisita;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }
}