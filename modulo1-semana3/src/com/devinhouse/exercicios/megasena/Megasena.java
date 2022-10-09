package com.devinhouse.exercicios.megasena;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Megasena {

    private List<Concurso> concursos;

    public Megasena(List<Concurso> concursos){
        this.concursos = concursos;
    }

    // Exercicio 5
    public void imprimir() {

        for(Concurso concurso: concursos){
            System.out.println(concurso);
        }
    }

    // Exercicio 6
    public void imprimirNumerosSorteadosOrdenados(){
        for(Concurso concurso: concursos){
            System.out.println(concurso.ordenarNumerosSorteados());
        }
    }

    // Exercicio 7
    public void imprimirConcursosEmOrdem(){
        Collections.sort(concursos);
        for(Concurso concurso: concursos){
            System.out.println(concurso);
        }
    }

    // Exercicio 8
    public void verificarExistenciaSorteio(){
        System.out.print("Informa a data a ser consultada (dd/mm/aaaa): ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPesquisada = LocalDate.parse(data, format);

        int[] sorteadosNaData = null;
        for (Concurso concurso : concursos){
            if(concurso.getData().equals(dataPesquisada)){
                sorteadosNaData = concurso.getSorteados();
                break;
            }
        }
        if (sorteadosNaData == null){
            System.out.println("Não houve sorteio nesta data.");
        }else {
            System.out.println(Arrays.toString(sorteadosNaData));
        }
    }

    // Exercicio 9
    public void verificarSeNumerosJaForamSorteados(){
        System.out.println("Digite seis numeros para pesquisar (separadas por vírgulas): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] split = input.split(",");

        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++){
            int numero = Integer.parseInt(split[i]);
            numeros[i] = numero;
        }

        List<Integer> listaNumeros = ConversorArrayLIsta.converterOrdenado(numeros);
        int[] numerosSorteados = null;
        for (Concurso concurso : concursos){
            List<Integer> numerosOrdenados= ConversorArrayLIsta.converterOrdenado(concurso.getSorteados());
            if (numerosOrdenados.toString().equals(listaNumeros.toString())){
                numerosSorteados = concurso.getSorteados();
                break;
            }
        }
        if (numerosSorteados == null){
            System.out.println("Números nunca sorrteados.");
        }else {
            System.out.println(Arrays.toString(numerosSorteados));
        }
    }

    // Exercicio 10
    public void imprimirNumerosFrequentes(){
        Map<Integer, Integer> map = new HashMap<>();
        for(Concurso concurso : concursos){
            int[] sorteados = concurso.getSorteados();
            for(int i = 0; i < sorteados.length; i++){
                int numero = sorteados[i];
                int recorrencia = map.getOrDefault(numero, 0);
                map.put(numero, recorrencia + 1);
            }
        }

        int numeroMaiorRecorrencia = 1;
        int numeroMenorRecorrencia = 1;
        int maiorRecorrencia = 0;
        int menorRecorrencia = Integer.MAX_VALUE;

        for(Integer numero: map.keySet()){
            Integer recorrencia = map.get(numero);

            if (recorrencia > maiorRecorrencia){
                maiorRecorrencia = recorrencia;
                numeroMaiorRecorrencia = numero;
            }

            if (recorrencia < menorRecorrencia){
                menorRecorrencia = recorrencia;
                numeroMenorRecorrencia = numero;
            }
        }

        System.out.println("Número mais frequente: " + numeroMaiorRecorrencia);
        System.out.println("Número menos frequente: " + numeroMenorRecorrencia);

    }

    public void imprimirNumeroMaisAtrasado() {
        Map<Integer, LocalDate> map = new HashMap<>();

        for (Concurso concurso: concursos) {
            int[] sorteados = concurso.getSorteados();
            for (int i = 0; i < sorteados.length; i++) {
                int numero = sorteados[i];
                if (map.containsKey(numero)) {
                    LocalDate dataUltimoSorteio = map.get(numero);
                    if (concurso.getData().isAfter(dataUltimoSorteio)) {
                        map.put(numero, concurso.getData());
                    }
                } else {
                    map.put(numero, concurso.getData());
                }
            }
        }

        LocalDate dataMaisAntiga = LocalDate.now();
        int numeroMaisAtrasado = 0;
        for(Integer numero: map.keySet()) {
            LocalDate data = map.get(numero);
            if (data.isBefore(dataMaisAntiga)) {
                dataMaisAntiga = data;
                numeroMaisAtrasado = numero;
            }
        }

        System.out.println("Mais atrasado: " + numeroMaisAtrasado);
    }
}
