package DatasEmJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesEmJava {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //para eu formatar a data do jeito que eu quero
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");     // ofParttern  serve para organizar as datas no formato que vc definir

        LocalDate localDate = LocalDate.now(); //Preciso instanciar primeiro
        LocalDateTime localDateTime = LocalDateTime.now();  //Informa a data e hora local
        Instant instant = Instant.now();  //Informa a data segundo o fuso de GMT: Greenwich Mean Time (time zone)

        LocalDate today = LocalDate.parse("2024-05-22");  /*PARSE recebe uma data em string*/
        LocalDateTime localDateTime1 = LocalDateTime.parse("2024-05-22T12:34:56.789");
        Instant instant1 = Instant.parse("2024-05-22T12:34:56Z"); //Informa a data segundo o fuso de GMT: Greenwich Mean Time (time zone) (obsserve que tem o "Z" no final)

        LocalDate today1 = LocalDate.parse("22/05/2024", dtf);
        LocalDate today2 = LocalDate.parse("22/05/2024 01:30", dtf2);

        LocalDate today3 = LocalDate.of(2024, 5, 22);  // LocalDate.of serve para instanciar o ano, mes e dia
        LocalDateTime today4 = LocalDateTime.of(2024, 5, 22, 12, 34, 56); // LocalDateTime.of serve para instanciar o ano, mes e dia e hora

        //Aqui só para projetar na tela os horarios e data
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(instant);
        System.out.println(today);
        System.out.println(localDateTime1);
        System.out.println(instant1);
        System.out.println(today1);
        System.out.println(today2);
        System.out.println(today3);
        System.out.println(today4);

    }
}
