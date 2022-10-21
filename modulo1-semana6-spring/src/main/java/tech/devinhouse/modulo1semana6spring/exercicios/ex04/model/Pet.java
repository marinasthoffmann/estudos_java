package tech.devinhouse.modulo1semana6spring.exercicios.ex04.model;

import lombok.Data;

@Data
public class Pet {
    private static Integer SEQUENCIA = 0;

    private Integer id;
    private String nome;
    private Integer idade;

    public Pet() {
        this.id = gerarId();
    }

    private Integer gerarId() {
        return ++SEQUENCIA;
    }
}