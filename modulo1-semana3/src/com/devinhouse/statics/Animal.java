package com.devinhouse.statics;

public class Animal {
    public static int contador = 0;

    public static String valorEstatico = "Animal";


    public String nome;  // atributo nao estático

    // construtor
    public Animal(String nome) {
        this.nome = nome;
        contador++;  // contador = contador + 1
    }


    // metodo estático
    public static String andar() {
        return "andando";
    }
}
