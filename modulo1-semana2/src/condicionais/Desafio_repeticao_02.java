package condicionais;

public class Desafio_repeticao_02 {
    public static void main(String[] args) {
//        Jack tinha um valor inicial de 1200 reais.
//        Escreva um script para calcular quantos anos levaria para ele atingir um montante de mais de 5000 reais, se ele investir num fundo que rende 10% ao ano.

        double valor = 1200;
        int anos = 0;

        while (valor < 5000){
            anos++;
            valor *= 1.10;
        }
        System.out.println("Quandidade de anos = " + anos);
    }
}
