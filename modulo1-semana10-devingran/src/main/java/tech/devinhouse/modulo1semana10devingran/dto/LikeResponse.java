package tech.devinhouse.modulo1semana10devingran.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LikeResponse {

    private Long id;
    private String nomePerfil;
    private LocalDateTime dataInclusao;

}
