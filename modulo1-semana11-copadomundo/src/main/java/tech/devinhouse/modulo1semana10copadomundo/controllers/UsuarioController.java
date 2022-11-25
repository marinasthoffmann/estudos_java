package tech.devinhouse.modulo1semana10copadomundo.controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana10copadomundo.dto.LoginRequest;
import tech.devinhouse.modulo1semana10copadomundo.dto.LoginResponse;
import tech.devinhouse.modulo1semana10copadomundo.dto.UsuarioRequest;
import tech.devinhouse.modulo1semana10copadomundo.dto.UsuarioResponse;
import tech.devinhouse.modulo1semana10copadomundo.models.Usuario;
import tech.devinhouse.modulo1semana10copadomundo.services.UsuarioService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private UsuarioService service;
    private ModelMapper mapper;

    private AuthenticationManager authManager;

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

    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        UsernamePasswordAuthenticationToken credentials = new UsernamePasswordAuthenticationToken(request.getEmail(), request.getSenha());
        Authentication authentication = authManager.authenticate(credentials);
        Usuario usuario = (Usuario) authentication.getPrincipal();
        String accessToken = service.generateToken(usuario);
        return ResponseEntity.ok(new LoginResponse(accessToken));
    }

}
