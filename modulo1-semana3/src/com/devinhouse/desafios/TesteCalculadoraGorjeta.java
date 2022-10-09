package com.devinhouse.desafios;

public class TesteCalculadoraGorjeta {
    public static void main(String[] args) {

        CalculadoraGorjeta calculadoraGorjeta = new CalculadoraGorjeta();
        calculadoraGorjeta.setValorDaConta(100.0);

        Double total = calculadoraGorjeta.calcularValorGorjeta(10.0);
        System.out.println(total);
    }
}
