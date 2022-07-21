package io.github.guilhermem.clientes.model.repository;

import io.github.guilhermem.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
