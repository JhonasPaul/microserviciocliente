package com.example.efjonathanortizcliente.service;

import com.example.efjonathanortizcliente.model.Cliente;
import com.example.efjonathanortizcliente.model.Pizzeria;

import java.util.List;

public interface iClienteService {
    public List<Cliente> listarCliente();
    public Cliente listarClientePorId(Integer id);
    public Cliente agregarCliente(Cliente cliente);
    public Cliente actualizarCliente(Cliente cliente);
    public void eliminarCliente(Integer id);

    public List<Pizzeria> listarPizzeria();

    public Pizzeria listarPizzeriaPorId(Integer id);

    public Pizzeria agregarPizzeria(Pizzeria pizzeria);


    public Pizzeria actualizarPizzeria(Pizzeria pizzeria);


    public void eliminarPizzeria(Integer in);

}
