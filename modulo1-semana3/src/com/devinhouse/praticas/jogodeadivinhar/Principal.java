package com.devinhouse.praticas.jogodeadivinhar;

public class Principal {

    public static void main(String[] args) {

        final int min = 0;
        final int max = 100;
        int sorteado = Sorteador.sortear(min, max);

        Jogo jogo = new Jogo(min, max, sorteado);
        jogo.imprimirSaudacao();
        boolean acertou = false;

        while (!acertou){
            int palpite = jogo.pedirPalpite();
            acertou = jogo.verificar(palpite);
        }
        System.out.println("Fim do jogo!");
    }
}
