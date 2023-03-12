package com.consulta.cliente.adapter.input;

import com.consulta.cliente.domain.entity.Cliente;
import com.consulta.cliente.port.output.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("Aplicação esta funcionando");
    }

    @PostMapping("/salvar-cliente")
    public ResponseEntity<String> salvarClinete(@RequestBody Cliente cliente){
         service.salvarCliente(cliente);
         return ResponseEntity.ok("Salvo com sucesso.");
    }
}
