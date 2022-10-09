package condicionais;

public class RepeticaoForSoma {
    public static void main(String[] args) {
        int soma = 0;
        for ( int i=0; i <= 2 ; i++) {
            System.out.println("somando mais" + i);
            soma += i;
        }
        System.out.println("Soma:  "+ soma);   // 3
    }
}
