package DatasEmJava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

    public static void main(String[] args) {

        LocalDate data1 = LocalDate.parse("2024-05-22");
        LocalDateTime data2 = LocalDateTime.parse("2024-05-22T01:30:26");
        Instant data3 = Instant.parse("2024-05-22T01:30:26Z");

        LocalDate pastWeekLocalDate = data1.minusDays(7); //Aqui eu estou diminuindo 7 dias em relação ao meu "data1"
        LocalDate nextWeekLocalDate = data1.plusDays(7);  //Aqui eu estou aumentando 7 dias em relação ao meu "data1"
                                                                    //para eu fazer essas operaçoes eu preciso criar um novo objeto e fazer as operaçoes de acrescentar e diminuir
        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
        System.out.println("==========================================");

        LocalDateTime pastWeekLocalDateTime = data2.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data2.plusDays(7);

        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
        System.out.println("==========================================");

        Instant pastWeekLocalInstant = data3.minus(7, ChronoUnit.DAYS); //
        Instant nextWeekLocalInstant = data3.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalInstant: " + pastWeekLocalInstant);
        System.out.println("nextWeekLocalInstant: " + nextWeekLocalInstant);
        System.out.println("==========================================");

        Duration duration1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data1.atStartOfDay()); //uso o "atStartOfDay" para converter o meu pastWeekLocalDate para LocalDate
        Duration duration2 = Duration.between(pastWeekLocalDateTime, data2);
        Duration duration3 = Duration.between(pastWeekLocalInstant, data3);

        System.out.println("duration1: " + duration1.toDays());   //aqui eu estou verificando quantos dias deu nesse determinado tempo informado
        System.out.println("duration2: " + duration2.toDays());  //aqui eu estou verificando quantos dias deu nesse determinado tempo informado
        System.out.println("duration3: " + duration3.toDays());  //aqui eu estou verificando quantos dias deu nesse determinado tempo informado
    }
}
