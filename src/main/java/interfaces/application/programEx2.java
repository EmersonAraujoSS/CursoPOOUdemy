package interfaces.application;

import interfaces.entities.ContractEx2;
import interfaces.entities.InstallmentEx2;
import interfaces.services.ContractServiceEx2;
import interfaces.services.PaypalServiceEx2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class programEx2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        ContractEx2 contract = new ContractEx2(number, data, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractServiceEx2 contractService = new ContractServiceEx2(new PaypalServiceEx2());
        contractService.processContract(contract, n);

        System.out.println("Parcelas: " );
        for (InstallmentEx2 installment : contract.getInstallments()) {
            System.out.println(installment.toString());
        }


        sc.close();
    }
}
