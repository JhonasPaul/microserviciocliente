package com.example.efjonathanortizcliente.feignclient;


import com.example.efjonathanortizcliente.model.Pizzeria;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="pizzeria-service", url="localhost:8002")
public interface PizzeriaFeignClient {

    @GetMapping("/pizzeria/listarpizzeria")
    List<Pizzeria> listarPizzerias();

    @GetMapping("pizzeria/listarpizzeriasporid/{id}")
    Pizzeria licarPorId(@PathVariable Integer id);

    @PostMapping("/pizzeria/agregarpizzerias")/*recurso y subrecurso del servicio pizzeria-service*/
    Pizzeria agregarPizzeria(@RequestBody Pizzeria pizzeria);


    @PutMapping("/pizzeria/actualizarpizzerias")
    Pizzeria actualizarPizzeria(@RequestBody Pizzeria pizzeria);



    @DeleteMapping("pizzeria/eliminarpizzerias/{id}")
    void eliminarPizzeria(@PathVariable Integer id);
}
