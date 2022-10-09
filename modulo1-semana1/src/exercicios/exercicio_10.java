package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        String anoNascimentoString = scanner.next();
        int anoNacimento = Integer.parseInt(anoNascimentoString);

        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();

        int idade = anoAtual - anoNacimento;
        System.out.println(idade);
    }
}
