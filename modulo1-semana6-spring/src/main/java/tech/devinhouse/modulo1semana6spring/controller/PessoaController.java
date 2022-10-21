package tech.devinhouse.modulo1semana6spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana6spring.model.Pessoa;
import tech.devinhouse.modulo1semana6spring.service.PessoaService;

import java.util.List;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> get(){
        return pessoaService.findAll();
    }

    @GetMapping(path = "{id}")
    public Pessoa get(@PathVariable Integer id){
        return pessoaService.findById(id);
    }

    @PostMapping
    public Pessoa post(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    @PutMapping(path = "{id}")
    public Pessoa put(@PathVariable Integer id, @RequestBody Pessoa pessoa){
        pessoa.setId(id);
        return pessoaService.save(pessoa);
    }

    @DeleteMapping
    public void delete(Integer id){
        pessoaService.delete(id);
    }
}
