package tech.devinhouse.excecoes;

public class GarfieldExeception extends Exception{ //checked, não pode ser ignorada, se extends RunTImeException vira unchecked

//    private String message; // mensagem do que aconteceu na exceção
//    // variável era nula e vc tentou usar ela

    public GarfieldExeception(){
        super("Garfield ficou chateado e lançou exceção"); //já existe atributo na classe mãe
    }

}
