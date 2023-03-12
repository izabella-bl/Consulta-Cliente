package com.consulta.cliente.port.input;

import com.consulta.cliente.domain.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente,String> {

    public List<Cliente> findBytipoCliente(Long cliente);
}
