package tech.devinhouse.heranca;

public class Zebra extends Animal {

    int quantidadesDeListras;

    public String zebrar(){
        return "zebra";
    }

    @Override
    public String emitirSom(){
        return "zurroooo";
    }

}
