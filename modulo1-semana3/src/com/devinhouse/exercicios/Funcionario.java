package com.devinhouse.exercicios;

public class Funcionario {

    // EXERCÍCIO 2
//    a) Crie uma classe 'Funcionario' com os atributos 'nome' (String) e 'salário' (Float).
//    b) Implemente um construtor que receba um argumento de nome e inicialize o atributo de 'nome' com este valor.
//    c) Implemente outro construtor que receba como argumentos nome e salário e inicialize os respectivos atributos.
//    d) Implemente um método público 'aumentar' que recebe como parâmetro um valor (Float). Na implementação, some este valor ao 'salário'.
//    e) Implemente outro método público 'aumentar' que recebe como parâmetros um valor (Float) e uma commissão (Float). Na implementação,
//    some ambos os valores ao 'salário'.
    private String nome;
    private Float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Float aumentar (Float valor){
        return this.salario + valor;
    }

    public Float aumentar (Float valor, Float comissao){
        return this.salario + valor + comissao;
    }

//EXERCICIO 1
    //    private String cpf;
//    private String nomeCompleto;
//    private Double salario;
//
//    public void setSalario(Double salario) {
//        this.salario = salario;
//    }
//
//    public Double promover(float percentual){
//        Double multiplicador = (percentual / 100) + 1.0;
//        return this.salario * multiplicador;
//    }
}
