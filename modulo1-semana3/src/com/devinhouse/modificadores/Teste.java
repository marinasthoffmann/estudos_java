package com.devinhouse.modificadores;

public class Teste {
    TesteModificadores teste = new TesteModificadores();

    String atributoPublico = teste.atributoPublico;
    String metodoPublico = teste.metodoPublico();

    String atributoDefault = teste.atributoDefault; // mesmo pacote
    String metodoDefault = teste.metodoDefault();   // mesmo pacote

//        teste.atributoPrivado; // nao compila
//        teste.metodoPrivado(); // nao compila

    String retorno = teste.metodoPublicoAcessandoAtributoPrivado();

}
