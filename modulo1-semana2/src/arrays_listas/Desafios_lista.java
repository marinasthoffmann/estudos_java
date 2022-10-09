package arrays_listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafios_lista {

    public static void main(String[] args) {

        //DESAFIO 3
//        Com base no que vimos sobre arrays, crie uma array de tamanho 5 e tipo “int”. Em seguida, adicione os números
//        de 1 a 5 em ordem sequencial.

        int [] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        //mesmo que int[] numeros2 = {1,2,3,4,5};

        //DESAFIO 4
//        Agora crie uma lista vazia de números (Integer). Adicione números começando do número 5 e indo até o número 10 (6 itens).

        List<Integer> lista2 = Arrays.asList(5, 6, 7, 8, 9, 10);
        List<Integer> lista3 = List.of(5, 6, 7, 8, 9, 10);


        List<Integer> lista = new ArrayList<>();
        lista.set(0, 5);
        lista.set(1, 6);
        lista.set(2, 7);
        lista.set(3, 8);
        lista.set(4, 9);
        lista.set(5, 10);

        lista.get(3); //obtem valor da posicao 3
    }
}
