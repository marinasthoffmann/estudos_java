package tech.devinhouse.exercicios.superherois.cli;

import tech.devinhouse.exercicios.superherois.exception.OpcaoInvalidaException;
import tech.devinhouse.exercicios.superherois.model.*;

import java.util.List;
import java.util.Scanner;

/**
 * Responsável por prover interação com usuário da applicação
 */

public class Display {

    public void exibirMenu(){
        System.out.println();
        System.out.println("== MENU ==");
        System.out.println("1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
        System.out.println();

    }

    public Operacoes obterOperacao() throws OpcaoInvalidaException {
        System.out.println("Digite a opção desejada: ");
        Scanner scanner = new Scanner(System.in);
        int codigoOperacao = scanner.nextInt();
        if(codigoOperacao < 0 || codigoOperacao > Operacoes.values().length){
            throw new OpcaoInvalidaException();
        }
        Operacoes operacao = Operacoes.obterPeloCodigo(codigoOperacao);
        return operacao;
    }

    public Personagem cadastrar(TipoPersonagem tipo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.println("Informe o super poder: ");
        String poder = scanner.nextLine();
        System.out.println();

        Personagem personagem;
        if (tipo == TipoPersonagem.HEROI){
            System.out.println("Informe o nome na vida real: ");
            String nomeVidaReal = scanner.nextLine();
            System.out.println();
            personagem = new Heroi(nome, poder, nomeVidaReal);
        } else {
            System.out.println("Informe o tempo de prisão (anos): ");
            String prisao = scanner.nextLine();
            System.out.println();
            personagem = new Vilao(nome, poder, Integer.valueOf(prisao));

        }
        return personagem;
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }

    public void listar(List<Personagem> personagens) {
        for (Personagem personagem : personagens){
            System.out.println(personagem);
        }
    }
}
