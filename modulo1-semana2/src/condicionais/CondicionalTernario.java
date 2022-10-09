package condicionais;

public class CondicionalTernario {
    public static void main(String[] args) {
        String nome = "Tiago";

        Double preco = (nome == "Tiago") ? 100.0: 200.0;

        System.out.println(preco);
    }
}
