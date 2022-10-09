package orientacao_objetos;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta(); //cria com titular null e saldo 0
        conta.saldo = 1000.0;

        Cliente cliente = new Cliente(); // cria cliente com nome, sobrenome e cpf null
        cliente.nome = "John";
        cliente.sobrenome = "Snow";
        cliente.cpf = 123456789l;

        conta.titular = cliente;

    }
}

class Cliente {
    String nome;
    String sobrenome;
    Long cpf; //inicializa com null, primitivo inicializa com 0

}

class Conta{
    Cliente titular;
    double saldo; // conta inicialida com 0, por isso tipo primitivo
}