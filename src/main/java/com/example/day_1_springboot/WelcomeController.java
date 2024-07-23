package com.example.day_1_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String name(){
        return "Hi my name is Abdulaziz Alharbi";
    }

    @GetMapping("/age")
    public int age(){
        return 24;
    }

    @GetMapping("check/status")
    public String check_status(){
        return "Everything is OK";
    }

    @GetMapping("/health")
    public String health (){
        return "Server health is up nd running";
    }


    @GetMapping("/names")
    public ArrayList<String> names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Abdulaziz");
        names.add("Majd");
        names.add("Muhammed");
        names.add("Waleed");
        return names;
    }
}
