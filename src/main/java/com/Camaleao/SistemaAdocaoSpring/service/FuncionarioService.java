package com.Camaleao.SistemaAdocaoSpring.service;

import com.Camaleao.SistemaAdocaoSpring.model.Funcionario;
import com.Camaleao.SistemaAdocaoSpring.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Funcionario cadastrar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    // LISTAR
    public List<Funcionario> listar() {
        return repository.findAll();
    }

    // BUSCAR POR ID
    public Funcionario buscarPorId(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public Funcionario buscarPorCpf(String cpf) {
    return repository.findByCpf(cpf);
}

    // DELETE
    public void deletar(int id) {
        repository.deleteById(id);
    }
}