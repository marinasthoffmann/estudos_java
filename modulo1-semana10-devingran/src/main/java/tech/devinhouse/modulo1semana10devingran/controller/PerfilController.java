package tech.devinhouse.modulo1semana10devingran.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.modulo1semana10devingran.dto.PerfilRequest;
import tech.devinhouse.modulo1semana10devingran.dto.PerfilResponse;
import tech.devinhouse.modulo1semana10devingran.dto.UpdatePerfilRequest;
import tech.devinhouse.modulo1semana10devingran.model.Perfil;
import tech.devinhouse.modulo1semana10devingran.model.Status;
import tech.devinhouse.modulo1semana10devingran.service.PerfilService;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
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
    public ResponseEntity<List<PerfilResponse>> listar(
            @RequestParam(value = "size", required = false, defaultValue = "3") Integer tamanho,
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer pagina,
            @RequestParam(value = "sort", required = false, defaultValue = "nome") String ordenacao,
            @RequestParam(value = "direction", required = false, defaultValue = "ASC") String direcao){
        List<Perfil> perfis = perfilService.consultar(tamanho, pagina, ordenacao, direcao);
        List<PerfilResponse> resp = new ArrayList<>();
        for (Perfil perfil: perfis) {
            PerfilResponse r = mapper.map(perfil, PerfilResponse.class);
            resp.add(r);
        }
        return ResponseEntity.ok(resp);
    }

    @GetMapping("filtrado")
    public ResponseEntity<List<PerfilResponse>> listarFiltrado(
            @RequestParam(value = "filtro-status", required = true)
            @Pattern(regexp = "ATIVO|INATIVO", message = "{campo.invalido}") String filtroStatus ) {
        Status status = Status.valueOf(filtroStatus);
        List<Perfil> perfis = perfilService.consultar(status);
        List<PerfilResponse> resp = new ArrayList<>();
        for (Perfil perfil: perfis) {
            PerfilResponse r = mapper.map(perfil, PerfilResponse.class);
            resp.add(r);
        }
//        List<PerfilResponse> resp = perfis.stream()
//                .map(p -> mapper.map(p, PerfilResponse.class)).collect(Collectors.toList());
        return ResponseEntity.ok(resp);
    }

    @GetMapping("{nome}")
    public ResponseEntity<PerfilResponse> listar(@PathVariable("nome") String nome) {
        Perfil perfil = perfilService.consultar(nome);
        PerfilResponse resp = mapper.map(perfil, PerfilResponse.class);
        return ResponseEntity.ok(resp);
    }

    @PostMapping
    public ResponseEntity<PerfilResponse> criar(@RequestBody @Valid PerfilRequest request){
        Perfil perfil = mapper.map(request, Perfil.class);
        perfil = perfilService.criar(perfil);
        PerfilResponse resp = mapper.map(perfil, PerfilResponse.class);
        return ResponseEntity.created(URI.create(resp.getNome())).body(resp);
    }

    @PutMapping("{nome}")
    public ResponseEntity<PerfilResponse> atualizar(@PathVariable("nome") String nome, @RequestBody @Valid UpdatePerfilRequest request){
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
