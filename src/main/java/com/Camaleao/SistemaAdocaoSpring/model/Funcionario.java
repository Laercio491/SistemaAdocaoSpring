package com.Camaleao.SistemaAdocaoSpring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfuncionario;

    private String nome;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(unique = true, nullable = false)
    private String email;

    private String cargo;

    // Construtor vazio obrigatório para JPA
    public Funcionario() {
    }

    public Funcionario(Integer idfuncionario, String nome, String cpf, String email, String cargo) {
        this.idfuncionario = idfuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
    }

    // Getters e Setters

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}