package tech.devinhouse.exercicios.ex03;

public class Produto implements Tributavel{

    private double valor;
    private double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return valor + valorImposto;
    }
}
