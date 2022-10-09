package tech.devinhouse.interfaces;

public interface Carro {

    // quem implementa interface não precisa colocar esse método
    default void acelerar(){
        System.out.println("acelerando generico");
    }
    void frear();
}
