package com.utp.edu.prueba.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class restcontroller {
    @GetMapping("/api/data")
    public String getApiData() {
        return "Datos de Api como respuesta";
    }
    
    @GetMapping("/api/saludo")
    public String getSaludo() {
        return "Hola desde el RestController";
    }
    
}
