package tech.devinhouse.modulo1semana11livraria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(description = "LivroResposta")
public class LivroResponse {

    private Integer id;

    @Schema(title = "Título do livro", description = "Representa o título do livro cadastrado no servidor")
    private String titulo;

    private String isbn;

    private String idioma;

    private Integer numeroPaginas;

    private LocalDateTime dataInclusao;

}
