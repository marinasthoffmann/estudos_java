package tech.devinhouse.heranca;

public class TestePolimorfismo {

    public static void main(String[] args) {

        Animal animal = new Tigre();
        String som = animal.emitirSom();
        System.out.println(som);

        Gato gato = new Gato();
        Animal tigre = new Tigre();

//        tomarBanho(animal);
//        tomarBanho(tigre);
        System.out.println(tomarBanho(tigre));
    }
    protected static String tomarBanho(Animal animal) {
        return animal.tomarBanho();
    }

}
