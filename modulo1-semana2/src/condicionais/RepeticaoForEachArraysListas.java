package condicionais;

import java.util.List;

public class RepeticaoForEachArraysListas {
    public static void main(String[] args) {
        String[] cores = {"vermelho", "branco", "preto"};

        for (String cor: cores){
            System.out.println(cor);
        }

        List<String> coresStr = List.of("vermelho", "branco", "preto");

        for (String cor : coresStr){
            System.out.println(cor);
        }
    }
}
