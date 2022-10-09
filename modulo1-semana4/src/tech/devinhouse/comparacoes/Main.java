package tech.devinhouse.comparacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Gato garfield = new Gato("Garfield", 5);
        Gato gato_de_botas = new Gato("Gato de botas", 3);

        int resultado = garfield.compareTo(gato_de_botas);
        System.out.println(resultado);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(gato_de_botas);
        gatos.add(garfield);
        Collections.sort(gatos);
        System.out.println(gatos); // ordenado com comparable (nome)

        Collections.sort(gatos, new IdadeComparator());
        System.out.println(gatos); // ordenado com comparator (idade)
    }
}
