package tech.devinhouse.praticas.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a operação que deseja realizar: ");
            System.out.println("A - adição / S - subtração / M - multiplicação / D - divisão");
            String opcao = scanner.next();
            opcao = opcao.toUpperCase();  // transformando em maiusculo
            Operacao operacao = obterOperacaoDesejada(opcao);

            System.out.print("Digite o valor 1: ");
            double valor1 = scanner.nextDouble();
            System.out.print("Digite o valor 2: ");
            double valor2 = scanner.nextDouble();

            double resultado = operacao.calcular(valor1, valor2);
            System.out.printf("O resultado é %.2f", resultado);
            System.out.println();
            System.out.println("Descricao: " + operacao.getDescricao());
        } catch (InputMismatchException e) {
            System.out.println("Valor informado inválido");
        } catch (CalculadoraException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Algum erro aconteceu!");
        } finally {
            System.out.println("Sempre executado!");
        }
        System.out.println("Fim do pograma!!");
    }

    private static Operacao obterOperacaoDesejada(String opcao) throws CalculadoraException {
        Operacao operacao;
        switch (opcao) {
            case "A":
                operacao = new Adicao();
                break;
            case "S":
                operacao = new Subtracao();
                break;
            case "M":
                operacao = new Multiplicacao();
                break;
            case "D":
                operacao = new Divisao();
                break;
            default:
//                operacao = null;
                throw new CalculadoraException("Operacao com valor inválido: " + opcao);
        }
        return operacao;
    }

}