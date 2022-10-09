package tech.devinhouse.praticas.calculadora;

public class Multiplicacao implements Operacao{

    String nome = "Multiplicação";

    @Override
    public double calcular(double valor1, double valor2) {
        return valor1 * valor2;
    }
}
