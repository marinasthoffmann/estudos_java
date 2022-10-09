package exercicios;
//Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = scanner.next();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        boolean ehPalindromo = palavra.equals(palavraInvertida);

        if(ehPalindromo){
            System.out.println("É palindromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }

    }
}
