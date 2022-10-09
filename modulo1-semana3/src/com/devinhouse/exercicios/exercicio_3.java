package com.devinhouse.exercicios;
//        a) Crie uma classe 'Contador'.
//        b) Crie um método estático (static) 'contarPalavras' que recebe uma frase (String) como argumento.
//        c) Implemente o método imprimindo no console o número de palavras da frase recebida como parâmetro.
//        d) Crie um método main em outra classe para testar a implementação.
//        Dicas:
//        - Usar método split() da String ou classe StringTokenizer.

public class exercicio_3 {
    public static void main(String[] args) {
        Contador.contarPalavras("Bom dia, como vai você?");
        Contador.contarPalavras("A gente espera do mundo e o mundo espera de nós");
    }
}
