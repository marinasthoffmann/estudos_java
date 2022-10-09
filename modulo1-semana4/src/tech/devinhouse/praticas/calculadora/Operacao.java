package tech.devinhouse.praticas.calculadora;

public interface Operacao {

    double calcular(double valor1, double valor2);

    default String getDescricao(){
        return getClass().getSimpleName();
    }
}
