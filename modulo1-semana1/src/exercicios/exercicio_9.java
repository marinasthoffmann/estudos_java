package exercicios;

import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu herói favorido: ");
        String heroi = scanner.nextLine();

        System.out.println("Seu herói favorito é " + heroi);
    }
}
