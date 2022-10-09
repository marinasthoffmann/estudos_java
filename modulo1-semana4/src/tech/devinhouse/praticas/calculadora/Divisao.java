package tech.devinhouse.praticas.calculadora;

public class Divisao implements Operacao{

    @Override
    public double calcular(double valor1, double valor2) {
        return valor1 / valor2;
    }
}
