package tech.devinhouse.modulo1semana11livraria.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LivroResponse {

    private Integer id;

    private String titulo;

    private String isbn;

    private String idioma;

    private Integer numeroPaginas;

    private LocalDateTime dataInclusao;

}
