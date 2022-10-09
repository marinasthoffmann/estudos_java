package com.devinhouse.praticas.personagem;

import java.time.LocalDate;

public class Personagem {

    private String nome;
    private String referencia;
    private Integer idade;
    private LocalDate dataCadastro;


    public Personagem(String nome, String referencia, Integer idade, LocalDate dataCadastro) {
        this.nome = nome;
        this.referencia = referencia;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
    }

    public String obterNomeEmMaiusculo(){
        return nome.toUpperCase();
    }

    public String obterTresPrimeirasLetrasDoNome(){
        return nome.substring(0,3);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", referencia='" + referencia + '\'' +
                ", idade=" + idade +
                ", dataCadastro=" + dataCadastro +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
