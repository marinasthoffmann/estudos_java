package tech.devinhouse.lambdas;

import tech.devinhouse.comparacoes.Gato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        //classe anonima
//        Autenticavel aut =(nome, senha) -> nome.equals(senha);

        Gato garfield = new Gato("Garfield", 5);
        Gato gato_de_botas = new Gato("Gato de botas", 3);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(garfield);
        gatos.add(gato_de_botas);
        System.out.println("Antes de ordenar: " + gatos);

        // criei um comparador de gfatos pela idade usandoo lambda function
        Comparator<Gato> idadeComparator = (g1, g2) -> g1.getIdade().compareTo(g2.getIdade());

        Collections.sort(gatos, idadeComparator);
        System.out.println("Depois de ordenar: " + gatos);

        gatos.stream()
                .sorted(Comparator.comparing(Gato::getNome).thenComparing(Gato::getIdade));

    }





}
