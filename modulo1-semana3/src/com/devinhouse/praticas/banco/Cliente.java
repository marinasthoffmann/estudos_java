package com.devinhouse.praticas.banco;

public class Cliente {

    private String nome;
    private Integer idade;
    private String profissao;


    public Cliente(String nome, Integer idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String obterNomeEmMaiusculo(){
        return nome.toUpperCase();
    }

    public String obterDadosFormatados(){
        return String.format("Cliente: %s, idade = %d, profissão = %s", nome, idade, profissao);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
