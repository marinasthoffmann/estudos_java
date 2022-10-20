package tech.devinhouse.modulo1semana6spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String get(){
        return "FUncionando corretamente!! \\o/";
    }


}
