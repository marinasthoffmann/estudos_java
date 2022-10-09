package com.devinhouse.praticas;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Thiago");
        pessoa.setSobrenome("Albuquerque");
        System.out.println(pessoa.getNome());
        String nomeCompleto = pessoa.obterNomeCompleto();
        System.out.println(nomeCompleto);

        pessoa.setIdade(20);
        Integer idade = pessoa.obterIdadeEmMeses();
        System.out.println(idade);
    }
}
