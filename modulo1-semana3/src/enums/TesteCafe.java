package enums;

public class TesteCafe {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.setTipo("Expresso");
        cafe.setTamanho(Tamanho.MÉDIO);
        System.out.println(cafe);

    }
}
