package com.valentina.exemplurest2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/salut")
    String hello(){
        return "Salut";
    }

    @PostMapping ("/ciao")
    String ciao(){
        return "Ciao";
    }

    @DeleteMapping ("/holiday")
    String holiday (){
        return "ooo";
    }
}

