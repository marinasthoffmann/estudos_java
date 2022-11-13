package tech.devinhouse.modulo1semana9exercicios.controllers;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana9exercicios.models.Venda;
import tech.devinhouse.modulo1semana9exercicios.services.VendaService;

import java.util.List;

@RestController
@RequestMapping(path = "venda")
public class VendaController {

    private VendaService vendaService;

    public VendaController(VendaService vendaService){
        this.vendaService = vendaService;
    }

    @GetMapping
    public List<Venda> get(){
        return vendaService.buscar();
    }

    @PostMapping
    public Venda post(@RequestBody Venda venda) throws Exception {
        return vendaService.salvar(venda);
    }

    @PutMapping
    public Venda put(@RequestBody Venda venda) throws Exception {
        return vendaService.salvar(venda);
    }

    @DeleteMapping
    public boolean delete(Integer id){
        return vendaService.apagar(id);
    }
}
