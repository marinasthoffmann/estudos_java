package condicionais;

public class CondicionalIf {
    public static void main(String[] args) {
        
        int idade = 20;
        
        if (idade <0) {
            System.out.println("Idade inválida");
        } else if (idade > 0 && idade < 12){
            System.out.println("É criança");
        } else if (idade >= 12 && idade <= 18) {
            System.out.println("É adolescente");
        } else if (idade < 60) {
            System.out.println("É adulto");
        } else{
            System.out.println("É idoso");
        }
    }
}
