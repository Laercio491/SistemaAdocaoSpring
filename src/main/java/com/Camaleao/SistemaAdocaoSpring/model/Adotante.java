package com.Camaleao.SistemaAdocaoSpring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "adotante")
public class Adotante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idadotante;

    private String nome;

    @Column(unique = true, nullable = false)
    private String cpf;

    private String telefone;

    private String endereco;

    // Construtor vazio obrigatório
    public Adotante() {
    }

    public Adotante(Integer idadotante, String nome, String cpf, String telefone, String endereco) {
        this.idadotante = idadotante;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters

    public Integer getIdadotante() {
        return idadotante;
    }

    public void setIdadotante(Integer idadotante) {
        this.idadotante = idadotante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}