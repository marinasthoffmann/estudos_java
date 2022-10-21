package tech.devinhouse.modulo1semana6spring.exercicios.ex04.controller;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana6spring.exercicios.ex04.model.Pet;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "pet")
public class PetController {

    private static List<Pet> pets = new ArrayList<>();

    @GetMapping
    public List<Pet> get(){
        return pets;
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet) {
        pets.add(pet);
        return pet;
    }

    @PutMapping(path = "{id}")
    public Pet put(@PathVariable Integer id, @RequestBody Pet pet){
        Pet petEditado = null;
        for (Pet p : pets) {
            if (p.getId() == id) {
                petEditado = p;
                break;
            }
        }

        if (petEditado != null) {
            petEditado.setNome(pet.getNome());
            petEditado.setIdade(pet.getIdade());
        }

        return petEditado;
    }

    @DeleteMapping
    public void delete(Integer id){
        Pet petRemover = null;
        for (Pet p : pets) {
            if (p.getId() == id) {
                petRemover = p;
                break;
            }
        }

        if (petRemover != null) {
            pets.remove(petRemover);
        }
    }
}
