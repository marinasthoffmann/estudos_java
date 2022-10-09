package tech.devinhouse.exercicios.superherois.model;

public class Vilao extends Personagem{

    private Integer tempoDePrisao;


    public Vilao(String nome, String superpoder, Integer tempoDePrisao) {
        super(nome, superpoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "tempoDePrisao=" + tempoDePrisao +
                '}';
    }

    public Integer getTempoDeprisao() {
        return tempoDePrisao;
    }

    public void setTempoDeprisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }

}
