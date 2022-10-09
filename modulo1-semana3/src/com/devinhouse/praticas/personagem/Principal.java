package com.devinhouse.praticas.personagem;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Personagem personagem = new Personagem("Jerry Seinfield", "Seinfield", 30, LocalDate.now());

        System.out.println(personagem.obterNomeEmMaiusculo());
        System.out.println(personagem.obterTresPrimeirasLetrasDoNome());
        System.out.println(personagem);

        Personagem personagem2 = new Personagem("Ragnar Lodbrok", "Vikings", 32, LocalDate.now());

        System.out.println(personagem2.obterNomeEmMaiusculo());
        System.out.println(personagem2.obterTresPrimeirasLetrasDoNome());
        System.out.println(personagem2);


    }
}
