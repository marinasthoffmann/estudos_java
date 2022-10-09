package arrays_listas;

public class Desafios_array {

    public static void main(String[] args) {
        // DESAFIO 1
        String[] cores = {"vermelho", "preto", "branco", "roxo", "azul", "amarelo"};

//        //imprima no console o tamanho deste array
//        System.out.println(cores.length);
//        // o valor do terceiro elemento do array
//        System.out.println(cores[2]);
//        //o valor do prrimeiro elemento do array
//        System.out.println(cores[0]);
//        //o valor do ultimo elemento do array
//        System.out.println(cores[cores.length - 1]);
//
        // DESAFIO 2
        String[][] multicores = {
                {"vermelho", "preto", "branco"},
                {"roxo", "azul"}
        };

        // o valor do primeiro elemento do primeiro array(interno)
        System.out.println(multicores[0][0]);
        // o valor do primeiro elemento do segundo array(interno)
        System.out.println(multicores[1][0]);
        //tamanho do array multidimensionals
        System.out.println((multicores.length));
        //tamanho do primeiro array
        System.out.println((multicores[0].length));
    }
}
