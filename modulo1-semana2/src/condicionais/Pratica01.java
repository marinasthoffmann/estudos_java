package condicionais;

public class Pratica01 {
    public static void main(String[] args) {
//        Dado uma idade, calcular se é maior de idade caso idade >= 18 anos;
        int idade = 18;

        if(idade >= 18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }

//        String  resultado = idade >= 18 ? "É maior de idade" : "Não é maior de idade";
//        System.out.println(resultado);

//        Calcular média de notas e imprimir se aprovado (média >= 7);

//        float[] notas = {10f, 5f, 7f, 8.5f};
//        float media = (notas[0] + notas[1] + notas[3] + notas[4]) / notas.length;
//        boolean passou;
//
//        if (media >= 7){
//            passou = true;
//        } else {
//            passou = false;
//        }
//
////        passou = media >= 7;
//        System.out.println(String.format("Média = %f e resultado = %s", media, passou));

//        Dado uma variável String como uma das cores do semáforo: vermelho, amarelo e verde,
//        implemente um código que imprima a frase correspondente:
//“vermelho” = “Deve parar o carro!”
//“amarelo” = “Deve finalizar travessia!”
//“verde” = “Pode passar!”;

        String cor = "verde";
        String resultado;

        switch (cor){
            case "vermelho":
                resultado = "Deve parar o carro";
                break;
            case "verde":
                resultado = "Pode passar";
                break;
            case "amarela":
                resultado = "Deve finalizar travessia!";
                break;
            default:
                resultado = "semáforo quebrado";
        }

        System.out.println(resultado);
    }
}
