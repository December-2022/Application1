package com.finops.Application1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHello(){

        return "Hello";
    }

    @GetMapping("/hi")
    public String sayHi(){

        return "Hi";
    }

    @GetMapping("/goodmorning")
    public String sayGoodMorning(){

        return "Hello Good morning";
    }

    @GetMapping("/hi2")
    public String sayHi2(){

        return "Hi again !!";
    }

    @GetMapping("/say-hi/{name}")
    public String sayHi3(@PathVariable String name){

        return "Hello " + name + " How are you !!";
    }

}
