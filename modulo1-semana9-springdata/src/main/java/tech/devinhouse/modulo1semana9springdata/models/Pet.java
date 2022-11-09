package tech.devinhouse.modulo1semana9springdata.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String tipo;
    private String raca;
    @ManyToOne
    @JsonIgnore
    private Tutor tutor;
}
