package com.utp.edu.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class controller {
    @GetMapping("/view")
    public String showView() {
        return "view-name";
    }
    

    @GetMapping("/data")
    @ResponseBody
    public String getData() {
        return "Datos simples como respuesta";
    }
    
}
