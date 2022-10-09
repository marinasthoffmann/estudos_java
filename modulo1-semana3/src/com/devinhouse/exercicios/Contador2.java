package com.devinhouse.exercicios;

public class Contador2 {

    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public Integer contarPalavras() {
        String[] palavras = this.frase.split(" ");
        return palavras.length;
    }
}
