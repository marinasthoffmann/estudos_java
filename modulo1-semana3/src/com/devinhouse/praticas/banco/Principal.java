package com.devinhouse.praticas.banco;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("John Snow", 30, "Vigilante");
        ContaBancaria contaBancaria = new ContaBancaria("Bamerindus", 123, "987X", 1000.0,
                cliente, LocalDateTime.of(2022, Month.JULY, 30, 10, 0));

        System.out.println(cliente.obterNomeEmMaiusculo());
        System.out.println(cliente);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do saque: R$ ");
        double valor = scanner.nextDouble();
        contaBancaria.sacar(valor);

        System.out.printf("Saque realizado! Saldo atual = %f", contaBancaria.getSaldo());
    }
}
