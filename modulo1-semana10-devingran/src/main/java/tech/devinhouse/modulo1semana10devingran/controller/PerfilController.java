package tech.devinhouse.modulo1semana10devingran.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.devinhouse.modulo1semana10devingran.model.Perfil;
import tech.devinhouse.modulo1semana10devingran.service.PerfilService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/v1/perfis")
@AllArgsConstructor
public class PerfilController {

    private PerfilService perfilService;

    @GetMapping
    public ResponseEntity<List<Perfil>> listar() {
//        List<Perfil> perfis = List.of(
//                new Perfil("marina", "doida varrida", LocalDate.now().minusYears(20), "desenvolvedor de sw", LocalDateTime.now(), LocalDateTime.now()),
//                new Perfil("lucas", "nada normal", LocalDate.now().minusYears(20), "desenvolvedor de sw", LocalDateTime.now(), LocalDateTime.now())
//        );
//        return ResponseEntity.ok(perfis);
        List<Perfil> perfis = perfilService.consultar();
        return ResponseEntity.ok(perfis);
    }

    @GetMapping("{nome}")
    public ResponseEntity<Perfil> listar(@PathVariable("nome") String nome) {
        Perfil perfil = perfilService.consultar(nome);
        return ResponseEntity.ok(perfil);
    }


}
