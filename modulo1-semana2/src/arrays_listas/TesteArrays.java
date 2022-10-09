package arrays_listas;

public class TesteArrays {
    public static void main(String[] args) {
        String[] frutas = {"laranja", "banana", "maçã"};  // ao invés de fruta1, fruta2, fruta3...
        double[] notas = {10, 8.5, 5.5, 9};    // ao invés de nota1, nota2, nota3, nota4 …
        String[][] turmas = {
                {"james", "scott", "spock"},
                {"luke", "obi-wan", "han"},
                {"john", "tyrion", "cersey"}
        };

        System.out.println(turmas[1][1]);

        int[] numeros = {1, 2, 3, 4};

        String[] nomes = {"João", "Maria", "Pedro", "Joana"};

        float[] notas2 = {9.5f, 8.5f, 7.5f, 6.5f};

        boolean[] booleans = {true, false, true, false};

        char[] caracteres = {'a', 'b', 'c', 'd'};

        double[] numerosDouble = {1.0, 2.0, 3.0, 4.0};

        long[] numerosLong = {1, 2, 3, 4};

        short[] numerosShort = {1, 2, 3, 4};

    }
}
