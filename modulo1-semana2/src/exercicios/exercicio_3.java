package exercicios;

public class exercicio_3 {
    public static void main(String[] args) {
//        Percorra array com estrutura de repetição e faça operações com condicionais:
//        O array abaixo representa lançamentos na conta bancária do Luke.
//        Os valores negativos são débitos e os valores positivos são créditos.
//
//        Implemente um código copiando o array abaixo, e depois imprima no console o que se pede:
//
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

//        a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem;

        for (int valor : extrato) {
            System.out.println("Valor: " +  valor);
        }

//        b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro);

        for (int i = extrato.length - 1; i >= 0; i--){
            System.out.println(extrato[i]);
        }

//        c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero),
//        imprima o resultado no console. (Dica: crie uma variável saldo inicializada com zero e vá atualizando seu valor);

        int saldo = 0;

        for (int valor : extrato) {
            saldo += valor;
        }
        System.out.println("O saldo é: R$" + saldo);

//        d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.

        String result = "nulo";
        if (saldo > 0){
            result = "positivo";
        } else if (saldo < 0) {
            result = "negativo";
        }

        System.out.println(String.format("O saldo é %s.", result));
    }
}
