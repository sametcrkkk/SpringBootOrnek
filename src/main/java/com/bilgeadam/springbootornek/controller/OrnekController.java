package com.bilgeadam.springbootornek.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrnekController {

    @GetMapping("/hosgeldin")
    @RequestMapping(value = "/hosgeldin", method = RequestMethod.GET)
    public String merhaba()
    {
        return "Merhaba Spring Boot";
    }

    @PostMapping("/ugurla")
    public String guleGule()
    {
        return "Hoşçakal Spring Boot";
    }

}
