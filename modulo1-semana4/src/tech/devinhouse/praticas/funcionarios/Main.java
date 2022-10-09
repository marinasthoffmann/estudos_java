package tech.devinhouse.praticas.funcionarios;

public class Main {
    public static void main(String[] args) {

        Funcionario func = new Diretor();

        String res = func.baterPonto();

        System.out.println(res);

        Autenticavel auth = new Diretor();
        auth.autenticar("Thiago", "admin");

    }
}
