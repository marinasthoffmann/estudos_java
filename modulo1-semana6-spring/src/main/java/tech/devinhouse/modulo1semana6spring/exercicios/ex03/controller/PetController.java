package tech.devinhouse.modulo1semana6spring.exercicios.ex03.controller;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana6spring.exercicios.ex03.model.Pet;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "pet")
public class PetController {

    private static List<Pet> pets = new ArrayList<>();

    @GetMapping
    public String get(){
        return "Read - Pet";
    }

    @PostMapping
    public String post() {
        return "Create - Pet";
    }

    @PutMapping
    public String put(){
        return "Update - Pet";
    }

    @DeleteMapping
    public String delete(){
        return "Delete - Pet";
    }
}
