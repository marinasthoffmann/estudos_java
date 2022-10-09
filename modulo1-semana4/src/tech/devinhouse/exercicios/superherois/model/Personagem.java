package tech.devinhouse.exercicios.superherois.model;

import java.util.Objects;

public abstract class Personagem implements Comparable<Personagem>{

    private String nome;
    private String superpoder;


    public Personagem(String nome, String superpoder) {
        this.nome = nome;
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Personagem o) {
        return this.getNome().compareTo(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
}
