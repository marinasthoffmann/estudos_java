package tech.devinhouse.modulo1semana10devingran.dto;

import lombok.Data;
import tech.devinhouse.modulo1semana10devingran.model.Status;

import java.time.LocalDate;

@Data
public class PerfilResponse {

    private String nome;

    private String biografia;

    private LocalDate dataNascimento;

    private String profissao;

    private Status status;
}
