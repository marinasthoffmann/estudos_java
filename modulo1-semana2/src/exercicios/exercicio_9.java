package exercicios;

//Então, dada o array com a sequência abaixo (de 0 a 30), use a função 'for' para iterar sobre seus elementos e
// a cada múltiplo de 3 imprimir a palavra 'PIN', ou o próprio número caso contrário.

public class exercicio_9 {
    public static void main(String[] args) {

        int[] sequencia = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30};

        for (int numero : sequencia){
            if (numero % 3 ==0){
                System.out.println("PIN");
            } else {
                System.out.println(numero);
            }
        }
    }
}
