package com.devinhouse.exercicios.megasena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConversorArrayLIsta {

    public static List<Integer> converter(int[] array){
        List<Integer> listaOrdenada = new ArrayList<>();

        for (int sorteado: array){
            listaOrdenada.add(sorteado);
        }

        return listaOrdenada;
    }

    public static List<Integer> converterOrdenado(int[] array){
        List<Integer> convertido = converter(array);
        Collections.sort(convertido);
        return convertido;
    }

}
