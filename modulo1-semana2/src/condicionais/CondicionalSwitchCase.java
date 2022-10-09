package condicionais;

public class CondicionalSwitchCase {
    public static void main(String[] args) {
        String cor = "Azul";

        switch (cor) {
            case "Azul":
                System.out.println("Cor do céu!");
//                break;
            case "Verde":
                System.out.println("Cor das plantas!");
                break;
            case "Dourado":
                System.out.println("Cor do ouro!");
                break;
            default:
                System.out.println("Outra cor");
                break;
        }
        System.out.println("Fora do switch case");
    }
}
