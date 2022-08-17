package com.example.efjonathanortizcliente.repository;

import com.example.efjonathanortizcliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
