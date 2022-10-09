package com.devinhouse.exercicios;

public class Contador {

    public static void contarPalavras(String frase) {
        String[] palavras = frase.split(" ");
        System.out.println(palavras.length);
    }
}
