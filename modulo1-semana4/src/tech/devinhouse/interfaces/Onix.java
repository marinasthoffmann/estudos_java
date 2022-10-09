package tech.devinhouse.interfaces;

public class Onix implements Carro{

    @Override
    public void acelerar() {
        System.out.println("onix acelerando");
    }

    @Override
    public void frear() {
        System.out.println("onix freando");
    }
}
