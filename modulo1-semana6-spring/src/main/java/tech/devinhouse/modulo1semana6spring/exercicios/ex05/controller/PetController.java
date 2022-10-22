package tech.devinhouse.modulo1semana6spring.exercicios.ex05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana6spring.exercicios.ex05.model.Pet;
import tech.devinhouse.modulo1semana6spring.exercicios.ex05.service.PetService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> get(){
        return petService.findAll();
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @PutMapping
    public Pet put(@RequestBody Pet pet){
        return petService.save(pet);
    }

    @DeleteMapping
    public boolean delete(Integer id){
        return petService.delete(id);
    }
}
