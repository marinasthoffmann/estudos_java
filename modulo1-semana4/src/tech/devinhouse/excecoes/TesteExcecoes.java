package tech.devinhouse.excecoes;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteExcecoes {
    public static void main(String[] args) throws IOException {
        System.out.println("COmeçou método main");
//        testarUnchecked();
//        testarChecked();
        try {
            testarMinhaExcecao();
        } catch (GarfieldExeception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("FIm do programa");

    }

    private static void testarMinhaExcecao() throws GarfieldExeception {
        System.out.println("Dentro do método minha exceção");
        throw new GarfieldExeception();
    }

    // Filhas de runtimeException, não precisa tratar
    private static void testarUnchecked(){
        String nada = null;

        try{
            nada.toUpperCase(); // JavaNUllPointerException
        } catch (RuntimeException e){
            System.out.println("Deu null pointer");
        }

//        int a = 7;
//        int b = 0;
//        int c = a / b; //ArithmeticException
    }

    // FIlha de Exception, precisa tratar
    private static void testarChecked() { // joga exceção pra cima
        Path path = Paths.get("arquivotestes.txt");

        try{
            Files.createFile(path); //IOException
        } catch (FileAlreadyExistsException e) {
            System.out.println("Ih, deu problema..");
            e.getMessage();
        } catch (IOException e){
            System.out.println("bla");
        }

    }

}
