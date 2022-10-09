//package com.devinhouse.praticas.listatodo;//package com.devinhouse.exercicios;
////Crie uma classe 'Funcionario' para representar um empregado de uma empresa, contendo os atributos cpf, nome completo e salário.
////        Implemente também um método 'promover' que recebe como parâmetro um percentual (float), devendo o salário ser aumentado pelo percentual indicado no argumento do método.
////        Crie e utilize um objeto desta classe para testar a implementação.
////
////public class exercicio_1 {
////    public static void main(String[] args) {
////
////        Funcionario funcionario = new Funcionario();
////
////        funcionario.setSalario(1000.0);
////
////        Double valor_promovido = funcionario.promover(10);
////        System.out.println(valor_promovido);
////    }
////}
//
//
//import com.devinhouse.praticas.listatodo.model.Operacao;
//import com.devinhouse.praticas.listatodo.view.TarefaView;
//
//public class Aplicacao {
//
//    private TarefaView view = new TarefaView();
//
//    public void executar(){
//        Operacao operacao = null;
//        while (operacao != null || operacao != Operacao.SAIR){
//            view.exibirMenu();
//            operacao = view.obterOpcao();
//            if(operacao == null){
//                view.informarOpcaoInvalida();
//            } else {
//                processar(operacao);
//            }
//        }
//        System.out.println("FIM!");
//    }
//
//    private void processar(Operacao operacao){
//        if (operacao == null){
//            view.informarOpcaoInvalida();
//            view.aguardar();
//        }
//    }
//}
