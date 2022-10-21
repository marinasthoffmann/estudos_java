package tech.devinhouse.modulo1semana6spring.exercicios.ex03.controller;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana6spring.exercicios.ex03.model.Tutor;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "tutor")
public class TutorController {

        private static List<Tutor> tutores = new ArrayList<>();

        @GetMapping
        public String get(){
            return "Read - Tutor";
        }

        @PostMapping
        public String post() {
            return "Create - Tutor";
        }

        @PutMapping
        public String put(){
            return "Update - Tutor";
        }

        @DeleteMapping
        public String delete(){
            return "Delete - Tutor";
        }
}
