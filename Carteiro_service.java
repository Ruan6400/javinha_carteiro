package com.tavolaquad.carteiro.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Carteiro_service {

    @Autowired
    private JavaMailSender mailSender;

    public void EnviarEmail(String para,String assunto,String corpo){
        SimpleMailMessage mensagem = new SimpleMailMessage();
        mensagem.setTo(para);
        mensagem.setSubject(assunto);
        mensagem.setText(corpo);
        mensagem.setFrom("goblinfuleiro@gmail.com");

        mailSender.send(mensagem);
    }
    
}
