package tech.devinhouse.modulo1semana6spring.exercicios.ex04.controller;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana6spring.exercicios.ex04.model.Tutor;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "tutor")
public class TutorController {

        private static List<Tutor> tutores = new ArrayList<>();

        @GetMapping
        public List<Tutor> get(){
            return tutores;
        }

        @PostMapping
        public Tutor post(@RequestBody Tutor tutor) {
            tutores.add(tutor);
            return tutor;
        }

        @PutMapping(path = "{id}")
        public Tutor put(@PathVariable Integer id, @RequestBody Tutor tutor){
            Tutor tutorEditado = null;
            for (Tutor t : tutores) {
                if (t.getId() == id) {
                    tutorEditado = t;
                    break;
                }
            }

            if (tutorEditado != null) {
                tutorEditado.setNome(tutor.getNome());
                tutorEditado.setIdade(tutor.getIdade());
            }

            return tutorEditado;
        }

        @DeleteMapping
        public void delete(Integer id){
            Tutor tutorRemover = null;
            for (Tutor t : tutores) {
                if (t.getId() == id) {
                    tutorRemover = t;
                    break;
                }
            }

            if (tutorRemover != null) {
                tutores.remove(tutorRemover);
            }
        }
}
