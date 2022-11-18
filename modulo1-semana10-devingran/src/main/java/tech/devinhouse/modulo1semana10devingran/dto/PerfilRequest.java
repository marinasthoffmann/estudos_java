package tech.devinhouse.modulo1semana10devingran.dto;

import lombok.Data;
import tech.devinhouse.modulo1semana10devingran.model.Status;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class PerfilRequest {

    @NotEmpty(message = "{campo.obrigatorio}")
    @Size(min = 4, max = 40, message = "{campo.invalido}")
    private String nome;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String biografia;

    @NotNull(message = "{campo.obrigatorio}")
    @Past(message = "{campo.invalido}")
    private LocalDate dataNascimento;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String profissao;

    @NotNull(message = "{campo.obrigatorio}")
    private Status status;
}
