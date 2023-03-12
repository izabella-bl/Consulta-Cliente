package com.consulta.cliente.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
public class Lista {
    private static final long serialVersionUID = 1L;
    private long listaCompra;
    private  String descricao;
    private boolean isPegou;

}
