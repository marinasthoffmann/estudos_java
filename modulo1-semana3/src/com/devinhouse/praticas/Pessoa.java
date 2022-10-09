package com.devinhouse.praticas;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private String profissao;
    private Boolean doadorDeOrgaos;
    private Float peso;

    public String obterNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

    public Integer obterIdadeEmMeses(){
        return this.idade * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public Boolean getDoadorDeOrgaos() {
        return doadorDeOrgaos;
    }

    public void setDoadorDeOrgaos(Boolean doadorDeOrgaos) {
        this.doadorDeOrgaos = doadorDeOrgaos;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
