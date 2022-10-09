package com.devinhouse.praticas.jogodeadivinhar;

import java.util.Scanner;

public class Jogo {

    final private int min;
    final private int max;
    final private int sorteado;

    public Jogo(int min, int max, int sorteado) {
        this.min = min;
        this.max = max;
        this.sorteado = sorteado;
    }

    public void imprimirSaudacao() {
        System.out.println("Olá, jogador! Bem vindo");
        System.out.println("Eu escolhi um número e você terá que adivinhar");
        System.out.println("O numero é entre " + min + " e " + max);
        System.out.println();
    }

    public int pedirPalpite() {
        System.out.println("Qual o seu palpite");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        return valor;
    }

    public boolean verificar(int palpite) {
        return palpite == sorteado;
    }
}
