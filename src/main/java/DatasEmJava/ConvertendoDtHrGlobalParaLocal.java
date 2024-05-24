package DatasEmJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDtHrGlobalParaLocal {

    public static void main(String[] args) {

        //Convertendo data-hora global para local

        LocalDate date1 = LocalDate.parse("2024-05-22");
        LocalDateTime date2 = LocalDateTime.parse("2024-05-22T01:30:26");
        Instant dataI3 = Instant.parse("2024-05-22T01:30:26Z");

        LocalDate result1 = LocalDate.ofInstant(dataI3, ZoneId.systemDefault()); //Aqui eu vou converter o meu "Instant dataI3" para o fuso horario do meu computador
        LocalDate result2 = LocalDate.ofInstant(dataI3, ZoneId.of("Portugal")); //Aqui eu vou converter o meu "Instant dataI3" para o fuso horario de Portugal
        LocalDateTime result3 = LocalDateTime.ofInstant(dataI3, ZoneId.systemDefault());
        LocalDateTime result4 = LocalDateTime.ofInstant(dataI3, ZoneId.of("Portugal"));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println("Dia: "+ date1.getDayOfMonth());  //Aqui eu estou pegando o dia da data local, nesse caso o "date1"
        System.out.println("Mes: " + date1.getMonth() + ", de value: " + date1.getMonthValue());
        System.out.println("Ano: " + date1.getYear());
        System.out.println("Hora: " + date2.getHour());
        System.out.println("Minuto: " + date2.getMinute());

    }
}
