package tech.devinhouse.modulo1semana10devingran.dto;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class PerfilResponse {

    private String nome;

    private String biografia;

    private LocalDate dataNascimento;

    private String profissao;
}
