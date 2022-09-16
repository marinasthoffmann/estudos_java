import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {

//        Data dataComDate = new Date(); //até milisegundos, datas originais até java 8

        // LocalDate
        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(1983, 5, 5);

        System.out.println(hoje);
        System.out.println(aniversario);

        //LocalDateTime
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime horario = LocalDateTime.of(1900, 5, 5, 11, 12, 10);

        System.out.println(agora);
        System.out.println(horario);


    }
}
