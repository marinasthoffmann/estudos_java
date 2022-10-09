package tech.devinhouse.exercicios.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean idadeValida = false;
        Integer idade = null;

        while (!idadeValida){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a sua idade: ");
            String entrada = scanner.next();

            try{
                Integer valor = Integer.valueOf(entrada);
                if (valor <= 0 || valor > 100){
                    throw new IdadeInvalidaException();
                }
                idadeValida = true;
                idade = valor;
            } catch (NumberFormatException e){
                System.out.println("Valor informado deve ser um número");
            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Idade informada é: " + idade);
    }
}
