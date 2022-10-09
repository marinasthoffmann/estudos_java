package exercicios;

//Dado a lista de números:
//        List<Integer> lista = Arrays.asList(1,2,3,4);
//        Percorra a lista e gere uma nova com o triplo do valor de cada elemento:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercicio_6 {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> nova_lista = new ArrayList<>();

        for (Integer item : lista){
            Integer novo_item = item * 3;
            nova_lista.add(novo_item);
        }

        System.out.println(nova_lista);
    }
}
