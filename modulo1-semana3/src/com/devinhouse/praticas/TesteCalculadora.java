package com.devinhouse.praticas;

public class TesteCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(3, 4);
        System.out.println(resultado);

        int outroResultado = calculadora.multiplicar(3,5);
        System.out.println(outroResultado);

        float aindaOutro = calculadora.dividir(3, 2);
        System.out.println(aindaOutro);
    }
}
