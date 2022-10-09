package com.devinhouse.praticas.jogodeadivinhar;

import java.util.Random;

public class Sorteador {

    public static int sortear(int min, int max){
        Random r = new Random();
        int aleatorio = r.nextInt((max - min) + 1) + min;
        return aleatorio;
    }

}
