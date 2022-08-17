package com.example.efjonathanortizcliente.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "cliente_pizzeria_detalle")
public class ClientePizzeriaDetalle {

    @EmbeddedId
    private ClientePizzeriaFK fk = new ClientePizzeriaFK();

}
