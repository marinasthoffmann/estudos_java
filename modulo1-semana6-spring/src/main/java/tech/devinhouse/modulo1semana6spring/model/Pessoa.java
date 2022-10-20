package tech.devinhouse.modulo1semana6spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //gera automaticamente getters e setters
//@AllArgsConstructor //construtor automaticamente gerado
public class Pessoa {

    private static Integer SEQUENCIA = 0;

    private Integer id;
    private String nome;
    private Integer idade;

    public Pessoa() {
        this.id = gerarId();
    }

    private Integer gerarId() {
        return ++SEQUENCIA;
    }
}
