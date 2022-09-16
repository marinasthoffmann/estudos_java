import java.sql.SQLOutput;

public class Principal {

    public static void main(String[] args) {
//        Gato garfield = new Gato(); // instanciando objeto gato

//        System.out.println("ANTES");
//        System.out.println("o nome do gato é " + garfield.nome);
//        System.out.println("a idade do gato é " + garfield.idade);
//
//        garfield.nome = "Garfield";
//        garfield.idade = 5;

//        System.out.println("DEPOIS");
//        System.out.println("o nome do gato é " + garfield.nome);
//        System.out.println("a idade do gato é " + garfield.idade);
//
//        System.out.println(garfield.miar());
//
//        String retorno = garfield.andar();
//        System.out.println(retorno);

        Endereco endereco = new Endereco();
        endereco.rua = "Rua LAuro Linhares";
        endereco.bairro = "Trindade";
        endereco.cep = 88888888L;

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "MArina";
        pessoa.idade = 29;
        pessoa.endereco = endereco;

    }
}
