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
import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping
    public ResponseEntity<List<JogadorResponse>> consultar(
            @PathVariable("sigla") String sigla, @RequestParam(value = "nome", required = false) String nomePesquisa){
        List<Jogador> jogadores = jogadorService.consultar(sigla, nomePesquisa);
        List<JogadorResponse> response = jogadores.stream().map(p -> mapper.map(p, JogadorResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<JogadorResponse> excluir(@PathVariable("sigla") String sigla, @PathVariable("id") Integer id){
        jogadorService.deletar(sigla, id);
        return ResponseEntity.noContent().build();
    }

}
