public class Gato {

    String nome;
    Integer idade;

    public String miar(){
        return "miuauuu";
    }

    public String andar(){
        return "estou andando";
    }

    public String toString() {
        return "O gato é: " + nome + " e tem " + idade + " anos.";
    }
}
