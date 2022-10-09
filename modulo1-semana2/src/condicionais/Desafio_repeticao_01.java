package condicionais;

public class Desafio_repeticao_01 {
    public static void main(String[] args) {
//        Dado o array abaixo, escreva um código para calcular quantos números positivos, negativos e zeros existem.

        int[] numeros = {5, 7, -7, -4, 3, -9, 0, 12, -34, 0, 3, 6, 9};

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }
        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);
        System.out.println("Quantidade de zeros: " + zeros);
    }
}
