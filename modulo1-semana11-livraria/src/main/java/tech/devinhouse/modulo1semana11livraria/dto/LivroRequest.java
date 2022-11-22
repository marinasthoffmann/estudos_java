package tech.devinhouse.modulo1semana11livraria.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class LivroRequest {

    @NotEmpty(message = "{campo.obrigatorio}")
    @Size(min=2, max=20, message = "{campo.invalido}")
    private String isbn;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String titulo;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String idioma;

    @NotNull(message = "{campo.obrigatorio}")
    private Integer numeroPaginas;

}
