package com.example.day_1_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String massage_1 (){
        return "Hello from Spring Boot!";
    }






}
