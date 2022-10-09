package tech.devinhouse.praticas.calculadora;

public class Adicao implements Operacao{

    String nome = "Adição";

    @Override
    public double calcular(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
