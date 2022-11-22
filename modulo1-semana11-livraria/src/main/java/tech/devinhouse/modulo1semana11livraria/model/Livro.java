package tech.devinhouse.modulo1semana11livraria.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "LIVROS")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LIVRO")
    private Integer id;

    private String isbn;

    private String titulo;

    private String idioma;

    private Integer numeroPaginas;

    private LocalDateTime dataInclusao;

}
