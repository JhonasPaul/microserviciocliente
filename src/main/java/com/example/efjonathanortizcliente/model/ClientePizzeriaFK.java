package com.example.efjonathanortizcliente.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ClientePizzeriaFK implements Serializable {
    private static final long serialVersionUID = 4417214286334278899L;

    @Column(nullable = false, unique = true)
    private Long id_cliente;
    @Column(nullable = false, unique = true)
    private Long id_pizzeria;
}
