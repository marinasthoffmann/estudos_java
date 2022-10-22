package tech.devinhouse.modulo1semana6spring.exercicios.ex06.model;

import lombok.Data;

@Data
public class Pet {

    private Integer id;
    private String nome;
    private Integer idade;
    private Tutor tutor;

}