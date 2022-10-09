package condicionais;

public class Desafio_condicional {
    public static void main(String[] args) {

        double peso = 55;
        double altura = 1.63;
        double imc = peso / (altura * altura);
        String classificacao;
        System.out.println(String.format("IMC CALCULADO = %.2f", imc));

        if (imc < 18.5){
            classificacao = "MAGREZA";
        } else if (imc < 25) {
            classificacao = "NORMAL";
        } else if (imc <30) {
            classificacao = "SOBREPESO";
        } else if (imc < 40) {
            classificacao = "OBESIDADE";
        } else {
            classificacao = "OBESIDADE GRAVE";
        }

        System.out.println(classificacao);
    }
}
