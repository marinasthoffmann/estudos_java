package com.devinhouse.sobrecarga;

public class TestesSobrecarga {

    public String obterDadosFormatados(String fonte) {
        return fonte.toUpperCase();
    }

    public String obterDadosFormatados(String fonte, int tipo) {
        if (tipo == 1) {
            return fonte.toUpperCase();
        }
        return fonte.toLowerCase();
    }

    public String obterDadosFormatados(Integer fonte) {
        return String.valueOf(fonte);
    }

    public String obterDadosFormatados() {
        return "valor padrao";
    }

//    public Integer obterDadosFormatados() {  // não compila
//        return 1;
//    }

}
