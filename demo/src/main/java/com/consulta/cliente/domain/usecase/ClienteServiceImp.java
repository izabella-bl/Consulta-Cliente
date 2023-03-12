package com.consulta.cliente.domain.usecase;

import com.consulta.cliente.domain.entity.Cliente;
import com.consulta.cliente.port.input.ClienteRepository;
import com.consulta.cliente.port.output.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public void salvarCliente (Cliente cliente){
        this.repository.save(cliente);
    }
}
