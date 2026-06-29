package com.Camaleao.SistemaAdocaoSpring.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnimal;

    private String nome;

    private Integer idade;

    private String raca;

    private String porte;

    private Boolean castracao;

    private LocalDate dataChegou;

    private String historicoAdo;

    private Boolean adotado;

    // Construtor vazio obrigatório
    public Animal() {
    }

    public Animal(Integer idAnimal, String nome, Integer idade, String raca, String porte,
            Boolean castracao, LocalDate dataChegou, String historicoAdo, Boolean adotado) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.castracao = castracao;

        this.dataChegou = dataChegou;
        this.historicoAdo = historicoAdo;
        this.adotado = adotado;
    }

    // Getters e Setters

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Boolean isCastracao() {
        return castracao;
    }

    public void setCastracao(Boolean castracao) {
        this.castracao = castracao;
    }

    public LocalDate getDataChegou() {
        return dataChegou;
    }

    public void setDataChegou(LocalDate dataChegou) {
        this.dataChegou = dataChegou;
    }

    public String getHistoricoAdo() {
        return historicoAdo;
    }

    public void setHistoricoAdo(String historicoAdo) {
        this.historicoAdo = historicoAdo;
    }

    public Boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(Boolean adotado) {
        this.adotado = adotado;
    }
}