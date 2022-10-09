package tech.devinhouse.optional;

import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args) {

//        String bla = null;
//        bla.toUpperCase();

        Optional<String> blaOpt = Optional.of("tiago");
        if (blaOpt.isEmpty()) {
            return;
        }

        String resultado = blaOpt.get();
        System.out.println(resultado);
        System.out.println("fim");

        Optional<String> resultado2 = tentarBuscarNome(1);

        String variavelQueSempreVaiTerValor = resultado2.orElse("valor padrao");
    }

    private static Optional<String> tentarBuscarNome(Integer valor) {
        if (valor == 1) {
            return Optional.of("achou");
        }
        return Optional.empty();
    }
}
