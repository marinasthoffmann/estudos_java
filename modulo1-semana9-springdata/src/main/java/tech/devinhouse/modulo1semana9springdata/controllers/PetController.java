package tech.devinhouse.modulo1semana9springdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana9springdata.models.Pet;
import tech.devinhouse.modulo1semana9springdata.services.PetService;

import java.util.List;

@RestController
@RequestMapping(path= "pet")
public class PetController {

    @Autowired private PetService petService;

    @GetMapping
    public List<Pet> get(String nome){
        if (nome != null && !nome.isEmpty()){
            return petService.get(nome);
        }
        return petService.get();
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet){
        return petService.save(pet);
    }

    @PutMapping
    public Pet put(@RequestBody Pet pet){
        return petService.save(pet);
    }

    @DeleteMapping
    public boolean delete(Integer id){
        return petService.remove(id);
    }
}
