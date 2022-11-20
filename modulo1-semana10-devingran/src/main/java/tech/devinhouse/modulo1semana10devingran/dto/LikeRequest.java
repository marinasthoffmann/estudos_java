package tech.devinhouse.modulo1semana10devingran.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LikeRequest {

    @NotEmpty(message = "{campo.obrigatorio}")
    private String nomePerfil;  // nome do perfil que deu like na publicacao

}
