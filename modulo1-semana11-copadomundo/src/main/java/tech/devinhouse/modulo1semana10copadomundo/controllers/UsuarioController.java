package tech.devinhouse.modulo1semana10copadomundo.controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana10copadomundo.dto.UsuarioRequest;
import tech.devinhouse.modulo1semana10copadomundo.dto.UsuarioResponse;
import tech.devinhouse.modulo1semana10copadomundo.models.Usuario;
import tech.devinhouse.modulo1semana10copadomundo.services.UsuarioService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/usuario")
@AllArgsConstructor
public class UsuarioController {

    private UsuarioService service;
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<UsuarioResponse> inserir(@RequestBody @Valid UsuarioRequest request){
        Usuario usuario = mapper.map(request, Usuario.class);
        usuario = service.criar(usuario);
        UsuarioResponse response = mapper.map(usuario, UsuarioResponse.class);
        return ResponseEntity.created(URI.create(response.getId().toString())).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> consultar() {
        List<Usuario> lista = service.consultar();
        List<UsuarioResponse> resp = lista.stream().map(s -> mapper.map(s, UsuarioResponse.class)).collect(Collectors.toList());
        return ResponseEntity.ok(resp);
    }

}
