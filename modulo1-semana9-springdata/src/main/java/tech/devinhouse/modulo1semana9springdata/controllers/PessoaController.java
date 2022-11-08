package tech.devinhouse.modulo1semana9springdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana9springdata.models.Pessoa;
import tech.devinhouse.modulo1semana9springdata.repositories.PessoaRepository;
import tech.devinhouse.modulo1semana9springdata.services.PessoaService;

import java.util.List;

@RestController
@RequestMapping(path = "pessoa")
public class PessoaController {

    @Autowired private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> get(){
        return pessoaService.findAll();
    }

    @PostMapping
    public Pessoa post(@RequestBody Pessoa pessoa){
        return pessoaService.save(pessoa);
    }

}
