package tech.devinhouse.comparacoes;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) { // negativo, zero e positivo
        //ordem de comparação é a idade dos gatoss
        return g1.getIdade().compareTo(g2.getIdade());
    }


}
