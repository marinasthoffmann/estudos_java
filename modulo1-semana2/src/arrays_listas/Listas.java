package arrays_listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Thiago");
        nomes.add("Marcos");
        nomes.add("Fabiane");

        System.out.println(nomes);
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.size());

        boolean apagou = nomes.remove("Thiago");
        System.out.println(apagou);
        System.out.println(nomes);

        nomes.clear();
        System.out.println(nomes);
        System.out.println(nomes.size());

        List<Long> numeros = Arrays.asList(10l, 34l, 56l, 78l);
        List<Long> copia = new ArrayList<>(numeros); // não faz referencia ao mesmo espaço na memoria
        numeros.set(2, 99l);
        System.out.println(numeros);
        System.out.println(copia);

        List<Long> outrosNumeros = List.of(10l, 34l, 56l, 78l); // imutável, não é possível remover

    }
}
