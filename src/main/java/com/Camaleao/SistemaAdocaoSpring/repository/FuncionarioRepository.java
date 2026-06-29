package com.Camaleao.SistemaAdocaoSpring.repository;

import com.Camaleao.SistemaAdocaoSpring.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    Funcionario findByCpf(String cpf);

    Funcionario findByEmail(String email);
}