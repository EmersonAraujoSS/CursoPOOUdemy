package DatasEmJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDtHrParaTexto {

    public static void main(String[] args) {

        //Convertendo data hora para texto

        LocalDate data1 = LocalDate.parse("2020-01-01");
        LocalDateTime data2 = LocalDateTime.parse("2020-01-02T01:30:26");
        Instant dataI3 = Instant.parse("2020-01-03T01:30:26Z");

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // aqui eu estou formatando para imprimir em texto de acordo com o fuso horario do sistema em que a pessoa esta
        DateTimeFormatter format4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter format5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(data1.format(format1)); //estou deixando a data formatada conforme o meu DateTimeFormatter
        System.out.println(data2.format(format2)); //estou deixando a data e hora formatada conforme o meu DateTimeFormatter
        System.out.println(data2.format(format3));
        System.out.println(format3.format(dataI3));
        System.out.println(format4.format(data2));
        System.out.println(format5.format(dataI3));


    }
}
