package com.devinhouse.finals;

public class TesteFinals {
    public static void main(String[] args) {

        final String valor = "teste";
//        valor = "outro valor";  // não compila

        Pessoa pessoa = new Pessoa("James", "Kirk");
//        pessoa.nome = "Spock";  // nao compila, atributo final

    }
}
