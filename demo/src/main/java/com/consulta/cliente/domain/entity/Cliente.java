package com.consulta.cliente.domain.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("Clientes")
public class Cliente {

    private String cpf;
    private long tipoCliente;
    private List<Lista> listaCompra;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente [cpf: ");
        builder.append(cpf);
        builder.append(", tipoCliente: ");
        builder.append(tipoCliente);
        builder.append(", listaCompra: " );
        builder.append(listaCompra);
        builder.append("]");
        return builder.toString();
    }
}
