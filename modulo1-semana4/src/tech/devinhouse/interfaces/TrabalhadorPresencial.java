package tech.devinhouse.interfaces;

public class TrabalhadorPresencial implements Trabalhador, Comparable{

    @Override
    public void baterPonto() {
        System.out.println("Bater ponto via biometria");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
