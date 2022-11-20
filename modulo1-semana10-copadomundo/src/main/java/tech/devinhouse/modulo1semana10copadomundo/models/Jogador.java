package tech.devinhouse.modulo1semana10copadomundo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "JOGADORES")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_JOGADOR")
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Posicao posicao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sigla", referencedColumnName = "sigla")
    private Selecao selecao;


}
