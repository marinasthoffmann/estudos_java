package tech.devinhouse.modulo1semana10copadomundo.controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana10copadomundo.dto.JogadorRequest;
import tech.devinhouse.modulo1semana10copadomundo.dto.JogadorResponse;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroExistenteException;
import tech.devinhouse.modulo1semana10copadomundo.models.Jogador;
import tech.devinhouse.modulo1semana10copadomundo.services.JogadorService;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("selecoes/{sigla}/jogadores")
@AllArgsConstructor
public class JogadorController {

    private JogadorService jogadorService;
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<JogadorResponse> criar(@PathVariable("sigla") String sigla,
                                                 @RequestBody @Valid JogadorRequest request){
        Jogador jogador = mapper.map(request, Jogador.class);
        try{
            jogador = jogadorService.criar(sigla, jogador);
        } catch(RegistroExistenteException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        JogadorResponse response = mapper.map(jogador, JogadorResponse.class);
        return ResponseEntity.created(URI.create(response.getId().toString())).body(response);
    }

}
