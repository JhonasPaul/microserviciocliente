package com.example.efjonathanortizcliente.controller;

import com.example.efjonathanortizcliente.model.Cliente;
import com.example.efjonathanortizcliente.model.Pizzeria;
import com.example.efjonathanortizcliente.service.iClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ClienteController {
    @Autowired
    private iClienteService service;

    @GetMapping("/clientes")
    public ResponseEntity<?> listarCategoria() {
        List<Cliente> lista = this.service.listarCliente();
        return new ResponseEntity<List<Cliente>>(lista, HttpStatus.OK);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable("id") Integer id) {
        Cliente categoria = this.service.listarClientePorId(id);
        return new ResponseEntity<Cliente>(categoria, HttpStatus.OK);
    }

    @PostMapping("/clientes")
    public ResponseEntity<?>agregar(@RequestBody Cliente categoria){
        Cliente categoriaNuevo = this.service.agregarCliente(categoria);
        return new ResponseEntity<Cliente>(categoriaNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/clientes")
    public ResponseEntity<?> actualizar(@RequestBody Cliente categoria) {
        Cliente clienteActualizado = this.service.actualizarCliente(categoria);
        return new ResponseEntity<Cliente>(clienteActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) {
        this.service.eliminarCliente(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/listarpizzeria")/*igual al recurso de car-service*/
    public ResponseEntity<List<Pizzeria>> listarCarro(){
        List<Pizzeria> listaCarro = this.service.listarPizzeria();
        return new ResponseEntity<List<Pizzeria>>(listaCarro,HttpStatus.OK);
    }


    @GetMapping("/listarpizzeriasporid/{id}")/*igual al recurso de car-service*/
    public ResponseEntity<Pizzeria> listarCarroPoId(@PathVariable("id") Integer id){
        Pizzeria listaPizzeria = this.service.listarPizzeriaPorId(id);
        return new ResponseEntity<Pizzeria>(listaPizzeria,HttpStatus.OK);
    }

    @PostMapping("/agregarpizzerias")
    public ResponseEntity<?> guardarCarro( @RequestBody Pizzeria car) {
        Pizzeria pizzeriaNueva = this.service.agregarPizzeria(car);
        return new ResponseEntity<Pizzeria>(pizzeriaNueva, HttpStatus.CREATED);
    }


    @PutMapping("/actualizarpizzerias")
    public ResponseEntity<?> actualizarCar(@RequestBody Pizzeria car) {
        Pizzeria pizzeriaActualizado = this.service.actualizarPizzeria(car);
        return new ResponseEntity<Pizzeria>(pizzeriaActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("eliminarpizzerias/{id}")
    public ResponseEntity<Void> eliminarCar(@PathVariable Integer id) {
        this.service.eliminarPizzeria(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
