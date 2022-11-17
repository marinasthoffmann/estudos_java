package tech.devinhouse.modulo1semana10devingran.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana10devingran.dto.PerfilRequest;
import tech.devinhouse.modulo1semana10devingran.dto.PerfilResponse;
import tech.devinhouse.modulo1semana10devingran.dto.UpdatePerfilRequest;
import tech.devinhouse.modulo1semana10devingran.model.Perfil;
import tech.devinhouse.modulo1semana10devingran.service.PerfilService;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/perfis")
@AllArgsConstructor
public class PerfilController {

    private PerfilService perfilService;
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<PerfilResponse>> listar() {
//        List<Perfil> perfis = List.of(
//                new Perfil("marina", "doida varrida", LocalDate.now().minusYears(20), "desenvolvedor de sw", LocalDateTime.now(), LocalDateTime.now()),
//                new Perfil("lucas", "nada normal", LocalDate.now().minusYears(20), "desenvolvedor de sw", LocalDateTime.now(), LocalDateTime.now())
//        );
//        return ResponseEntity.ok(perfis);
        List<Perfil> perfis = perfilService.consultar();
//        List<PerfilResponse> resp = new ArrayList<>();
//        for (Perfil perfil: perfis){
//            PerfilResponse r = mapper.map(perfil, PerfilResponse.class);
//            resp.add(r);
//        }
        List<PerfilResponse> resp = perfis.stream().map(p -> mapper.map(p, PerfilResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(resp);
    }

    @GetMapping("{nome}")
    public ResponseEntity<PerfilResponse> listar(@PathVariable("nome") String nome) {
        Perfil perfil = perfilService.consultar(nome);
        PerfilResponse resp = mapper.map(perfil, PerfilResponse.class);
        return ResponseEntity.ok(resp);
    }

    @PostMapping
    public ResponseEntity<PerfilResponse> criar(@RequestBody PerfilRequest request){
        Perfil perfil = mapper.map(request, Perfil.class);
        perfil = perfilService.criar(perfil);
        PerfilResponse resp = mapper.map(perfil, PerfilResponse.class);
        return ResponseEntity.created(URI.create(resp.getNome())).body(resp);
    }

    @PutMapping("{nome}")
    public ResponseEntity<PerfilResponse> atualizar(@PathVariable("nome") String nome, @RequestBody UpdatePerfilRequest request){
        Perfil perfil = mapper.map(request, Perfil.class);
        perfil.setNome(nome);
        perfil = perfilService.atualizar(perfil);
        PerfilResponse resp = mapper.map(perfil, PerfilResponse.class);
        return ResponseEntity.created(URI.create(resp.getNome())).body(resp);
    }

    @DeleteMapping("{nome}")
    public ResponseEntity excluir(@PathVariable("nome") String nome){
        perfilService.excluir(nome);
        return ResponseEntity.noContent().build();
    }


}
