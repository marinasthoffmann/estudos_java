package exercicios;

public class exercicio_8 {

    public static void main(String[] args) {
        String time = "Tabajara F.C.";
        int vitorias = 12;
        int empates = 6;
        int derrotas = 2;
        int jogos = vitorias + empates + derrotas;
        int pontuacao = (3 * vitorias) + empates;

        System.out.println("O time " + time + " acumulou " + pontuacao + " pontos após jogar " + jogos + " partidas.");
    }
}
