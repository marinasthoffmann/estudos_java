package com.devinhouse.exercicios.megasena;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Concurso implements Comparable<Concurso>{

    private Integer numero;
    private LocalDate data;
    private int[] sorteados;


    public Concurso() {
    }

    public Concurso(Integer numero, LocalDate data, int[] sorteados) {
        this.numero = numero;
        this.data = data;
        this.sorteados = sorteados;
    }

    public String ordenarNumerosSorteados(){
        List<Integer> listaOrdenada = ConversorArrayLIsta.converterOrdenado(sorteados);

        return "Concurso{" +
                "numero=" + numero +
                ", data=" + data +
                ", sorteados=" + listaOrdenada +
                '}';
    }

    @Override
    public int compareTo(Concurso c) {
        return this.numero.compareTo(c.numero);
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "numero=" + numero +
                ", data=" + data +
                ", sorteados=" + Arrays.toString(sorteados) +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int[] getSorteados() {
        return sorteados;
    }

    public void setSorteados(int[] sorteados) {
        this.sorteados = sorteados;
    }

}
