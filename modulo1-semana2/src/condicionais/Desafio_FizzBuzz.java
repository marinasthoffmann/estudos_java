package condicionais;

public class Desafio_FizzBuzz {
    public static void main(String[] args) {
//        “FizzBuzz”: Percorra uma sequência de números de 0 a 33 e para cada elemento imprima no console um valor conforme indicado:
//
//        - Nro divisível por 3            ==> Fizz
//                - Nro divisível por 5            ==> Buzz
//                - Nro Divisível por 3 e 5     ==> FizzBuzz
//                - Qualquer outro número  ==> Repete mesmo número
//
//        Dicas:
//        Usar laço for para iterar entre nro inicial e final e condicional if .. else if para decidir o que imprimir.
//                Lembrete: Número divisível é aquele cujo resto da divisão (operador %) é zero.
//        Exemplo:  90 % 3 = 0, logo 90 é divisível por 3.

        for (int i = 0; i <= 33; i++){
            if (i % 3 == 0){
                if(i % 5 == 0){
                    System.out.println("FizzBuzz");
                }
                else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
