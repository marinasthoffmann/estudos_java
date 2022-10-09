package exercicios;

//Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.

import java.util.Arrays;
import java.util.List;

public class exercicio_8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        for (Integer numero : numeros){
            if (numero > 50){
                System.out.println(numero);
                break;
            }
        }
    }
}
