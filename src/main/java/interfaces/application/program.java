package interfaces.application;

import interfaces.entities.CarRental;
import interfaces.entities.Vehicle;
import interfaces.services.BrasilTaxService;
import interfaces.services.RentalService;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(modelo));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());
        rs.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.print("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.print("Imposto: " + cr.getInvoice().getTax());
        System.out.print("Pagamento Total: " + cr.getInvoice().gettotalPayment());




        sc.close();
    }
}
