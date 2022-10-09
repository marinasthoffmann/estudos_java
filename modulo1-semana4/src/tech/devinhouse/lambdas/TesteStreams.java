package tech.devinhouse.lambdas;

import tech.devinhouse.comparacoes.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TesteStreams {
    public static void main(String[] args) {

        Gato garfield = new Gato("Garfield", 5);
        Gato gato_de_botas = new Gato("Gato de botas", 3);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(garfield);
        gatos.add(gato_de_botas);

        Optional<Gato> garfield_filtrado = gatos.stream().filter(gato -> gato.getNome().equals("garfield")).findFirst();

        List<Integer> gatos2 = gatos.stream()
                .filter(gato -> gato.getNome().equals("garfield"))
                .map(gato -> gato.getIdade())
                .collect(Collectors.toList());
    }
}
