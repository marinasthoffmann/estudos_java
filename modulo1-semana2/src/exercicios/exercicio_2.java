package exercicios;

public class exercicio_2 {
    public static void main(String[] args) {
        //    Implemente um código copiando o array abaixo, e depois imprima no console o valor dos seguintes elementos:

        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

//    a) Imprima o valor da nota do primeiro elemento do terceiro array de notas.
        System.out.println(notas[2][0]);
//    b) Imprima o valor da nota do segundo elemento do quarto array de notas.
        System.out.println(notas[3][1]);
//    c) Imprima o valor da soma das quatro primeiras notas de cada array.
        double soma_0 = notas[0][0] + notas[0][1] + notas[0][2] + notas[0][3];
        System.out.println(soma_0);
        double soma_1 = notas[1][0] + notas[1][1] + notas[1][2] + notas[1][3];
        System.out.println(soma_1);
        double soma_2 = notas[2][0] + notas[2][1] + notas[2][2] + notas[2][3];
        System.out.println(soma_2);
        double soma_3 = notas[3][0] + notas[3][1] + notas[3][2] + notas[3][3];
        System.out.println(soma_3);
    }
}
