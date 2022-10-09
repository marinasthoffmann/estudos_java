package exercicios;

//Implemente uma função 'calcular' que receba como parâmetro um array (numérico) e identifique o maior e menor valor do mesmo.
// Imprima no console estes valores ou "Não é possível calcular" qdo não for possível.//
// Teste a função com as seguintes entradas:

public class exercicio_5 {

    public static void main(String[] args) {
        int[][] array = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                null,
                {-2,-2,-2,-2},
                {20,10,30},
                {}
        };

        Solucao solucao = new Solucao();

        for (int[] ints : array) {
            solucao.calcular(ints);
            System.out.println();
        }
    }
}

class Solucao {
    public void calcular(int [] array){

        if (array == null){
            System.out.println("Não é possível calcular");
            return;
        }

        int maior = array[0];
        int menor = array[0];

        for (int j : array) {
            if (j > maior) {
                maior = j;
            }
            if (j < menor) {
                menor = j;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}