package tech.devinhouse.modulo1semana10copadomundo.controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.devinhouse.modulo1semana10copadomundo.dto.SelecaoRequest;
import tech.devinhouse.modulo1semana10copadomundo.dto.SelecaoResponse;
import tech.devinhouse.modulo1semana10copadomundo.models.Selecao;
import tech.devinhouse.modulo1semana10copadomundo.services.SelecaoService;

import javax.validation.Valid;
import java.net.URI;

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
}
