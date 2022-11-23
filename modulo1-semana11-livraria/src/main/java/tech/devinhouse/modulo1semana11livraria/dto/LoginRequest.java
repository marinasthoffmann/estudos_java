package tech.devinhouse.modulo1semana11livraria.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "{campo.obrigatorio}")
    @Email(message = "{campo.invalido}")
    private String email;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String senha;
}
