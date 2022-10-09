package tech.devinhouse.praticas.calculadora;

public class Subtracao implements Operacao{

    String nome = "Subtração";

    @Override
    public double calcular(double valor1, double valor2) {
        return valor1 - valor2;
    }

}
