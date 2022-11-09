package tech.devinhouse.modulo1semana9springdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana9springdata.models.Pet;
import tech.devinhouse.modulo1semana9springdata.models.Tutor;
import tech.devinhouse.modulo1semana9springdata.services.PetService;
import tech.devinhouse.modulo1semana9springdata.services.TutorService;

import java.util.List;

@RestController
@RequestMapping(path= "tutor")
public class TutorController {

    @Autowired private TutorService tutorService;

    @GetMapping
    public List<Tutor> get(){
        return tutorService.get();
    }

    @PostMapping
    public Tutor post(@RequestBody Tutor tutor){
        return tutorService.save(tutor);
    }

    @PutMapping
    public Tutor put(@RequestBody Tutor tutor){
        return tutorService.save(tutor);
    }

    @DeleteMapping
    public boolean delete(Integer id){
        return tutorService.remove(id);
    }
}
