package com.devinhouse.exercicios.megasena;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {

        List<String> resultado = lerArquivo();

        ArrayList<Concurso> concursos = carregarConcurso(resultado);

        Megasena megasena = new Megasena(concursos);
//        megasena.imprimir(); //exercicio 5
//        megasena.imprimirNumerosSorteadosOrdenados(); //exercicio 6
//        megasena.imprimirConcursosEmOrdem(); //exercicio 7
//        megasena.verificarExistenciaSorteio();// exercicio 8
//        megasena.verificarSeNumerosJaForamSorteados(); //exercicio 9
//        megasena.imprimirNumerosFrequentes(); //exercicio 10
        megasena.imprimirNumeroMaisAtrasado(); //exercicio 11
    }

    private static List<String> lerArquivo() throws IOException {
        Path path = Paths.get("src","com", "devinhouse", "exercicios", "megasena", "megasena.txt");
        List<String> resultado = Files.readAllLines(path);
        return resultado;
    }
    private static ArrayList<Concurso> carregarConcurso(List<String> resultado) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<Concurso> concursos = new ArrayList<>();

        for (String item : resultado){
            String [] dados_concurso = item.split(",");
            Integer numero = Integer.valueOf(dados_concurso[0]);
            LocalDate data = LocalDate.parse(dados_concurso[1], format);

            int[] numeros_sorteados = new int[6];
            for (int i = 2; i <= 7; i++){
                int numero_sorteado = Integer.parseInt(dados_concurso[i]);
                numeros_sorteados[i-2] = numero_sorteado;
            }

            Concurso concurso = new Concurso(numero, data, numeros_sorteados);
            concursos.add(concurso);

        }
        return concursos;
    }
}
