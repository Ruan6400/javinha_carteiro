package com.tavolaquad.carteiro.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tavolaquad.carteiro.services.Carteiro_service;


@RestController
public class Carteiro_controller {
    
    @Autowired
    private Carteiro_service email_service;

    @GetMapping("/enviar-email")
    public String Trabalhe_Carteiro(@RequestParam String para){
        email_service.EnviarEmail(para, "Meu pal na tua mão", "enviado viado");
        return "Email enviado";
    }
}
