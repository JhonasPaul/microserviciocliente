package com.example.efjonathanortizcliente.service;

import com.example.efjonathanortizcliente.feignclient.PizzeriaFeignClient;
import com.example.efjonathanortizcliente.model.Cliente;
import com.example.efjonathanortizcliente.model.Pizzeria;
import com.example.efjonathanortizcliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements iClienteService {
    @Autowired
    private ClienteRepository repository;

    @Autowired
    private PizzeriaFeignClient feign;

    @Override
    public List<Cliente> listarCliente() {
        return this.repository.findAll();
    }

    @Override
    public Cliente listarClientePorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        return this.repository.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return this.repository.saveAndFlush(cliente);
    }

    @Override
    public void eliminarCliente(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Pizzeria> listarPizzeria() {
        return this.feign.listarPizzerias();
    }

    @Override
    public Pizzeria listarPizzeriaPorId(Integer id) {
        return this.feign.licarPorId(id);
    }

    @Override
    public Pizzeria agregarPizzeria(Pizzeria pizzeria) {
        return this.feign.agregarPizzeria(pizzeria);
    }

    @Override
    public Pizzeria actualizarPizzeria(Pizzeria pizzeria) {
        return this.feign.actualizarPizzeria(pizzeria);
    }

    @Override
    public void eliminarPizzeria(Integer id) {
        this.feign.eliminarPizzeria(id);
    }


}
