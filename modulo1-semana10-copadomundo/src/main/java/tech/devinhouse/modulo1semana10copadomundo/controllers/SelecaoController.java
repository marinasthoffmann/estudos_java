package tech.devinhouse.modulo1semana10copadomundo.controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana10copadomundo.dto.SelecaoRequest;
import tech.devinhouse.modulo1semana10copadomundo.dto.SelecaoResponse;
import tech.devinhouse.modulo1semana10copadomundo.models.Selecao;
import tech.devinhouse.modulo1semana10copadomundo.services.SelecaoService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("selecoes")
@AllArgsConstructor
public class SelecaoController {

    private SelecaoService service;
    private ModelMapper mapper;


    @PostMapping
    public ResponseEntity<SelecaoResponse> criar(@RequestBody @Valid SelecaoRequest request){
        Selecao selecao = mapper.map(request, Selecao.class);
        selecao = service.criar(selecao);
        SelecaoResponse response = mapper.map(selecao, SelecaoResponse.class);
        return ResponseEntity.created(URI.create(response.getSigla())).body(response);
    }

    @GetMapping
    public ResponseEntity<List<SelecaoResponse>> consultar(){
        List<Selecao> selecoes = service.consultar();
        List<SelecaoResponse> response = selecoes.stream()
                .map(s -> mapper.map(s, SelecaoResponse.class)).collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }
}
