package com.devinhouse.statics;

public class TesteStatics {
    public static void main(String[] args) {
        Animal cachorro = new Animal("Cachorro");
        Animal gato = new Animal("Gato");
        Animal leao = new Animal("Leão");

        System.out.println( Animal.contador );         // atributo da classe
        System.out.println( Animal.valorEstatico );    // atributo da classe
        System.out.println( cachorro.nome + " - " + cachorro.contador );  // atributo da classe acessado por uma instância
        System.out.println( gato.nome + " - " + gato.contador );      // atributo da classe acessado por outro instância (mesmo valor)

        System.out.println( Animal.andar() );
    }
}
