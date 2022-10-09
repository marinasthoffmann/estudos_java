package tech.devinhouse.exercicios.superherois.model;

public enum Operacoes {

    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Operacoes obterPeloCodigo(int codigo){
        Operacoes[] operacoes = Operacoes.values();
        return operacoes[codigo-1];
    }
}
