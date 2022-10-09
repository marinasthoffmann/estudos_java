package com.devinhouse.praticas.banco;

import java.time.LocalDateTime;

public class ContaBancaria {

    private String nome;
    private Integer agencia;
    private String conta;
    private double saldo;
    private Cliente cliente;
    private LocalDateTime dataCriacao;


    public ContaBancaria(String nome, Integer agencia, String conta, double saldo, Cliente cliente, LocalDateTime dataCriacao) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.dataCriacao = dataCriacao;
    }

    public void sacar(double valor){
        if (saldo <= 0)
            return;
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", agencia=" + agencia +
                ", conta='" + conta + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", dataCriacao=" + dataCriacao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
