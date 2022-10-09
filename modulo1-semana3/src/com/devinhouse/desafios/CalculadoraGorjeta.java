package com.devinhouse.desafios;

public class CalculadoraGorjeta {

    private Double valorDaConta;
    private Double percentualDeGorjeta;


    public Double calcularValorGorjeta(Double percentualDeGorjeta){
        Double multiplicador = (percentualDeGorjeta / 100) + 1.0;
        return multiplicador * this.valorDaConta;
    }

    public Double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(Double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }

    public Double getPercentualDeGorjeta() {
        return percentualDeGorjeta;
    }

    public void setPercentualDeGorjeta(Double percentualDeGorjeta) {
        this.percentualDeGorjeta = percentualDeGorjeta;
    }
}
