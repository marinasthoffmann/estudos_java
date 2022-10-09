package condicionais;

import java.util.List;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = List.of(1, 2, 3, 4);

        System.out.println(menu.get(0) + " - Primeira Opção");
        System.out.println(menu.get(1) + " - Segunda Opção");
        System.out.println(menu.get(2) + " - Terceira Opção");
        System.out.println(menu.get(3) + " - Quarta Opção");

        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        boolean contemOpcao = menu.contains(opcao);

        System.out.println(contemOpcao);
    }
}
