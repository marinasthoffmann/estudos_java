package tech.devinhouse.modulo1semana6spring.controller;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana6spring.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaController {

    private static List<Pessoa> pessoas = new ArrayList<>();

    @GetMapping
    public List<Pessoa> get(){
        return pessoas;
    }

    @PostMapping
    public Pessoa post(@RequestBody Pessoa pessoa) {
        pessoas.add(pessoa);
        return pessoa;
    }
}
