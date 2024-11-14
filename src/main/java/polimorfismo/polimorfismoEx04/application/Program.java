package polimorfismo.polimorfismoEx04.application;

import polimorfismo.polimorfismoEx04.entities.Company;
import polimorfismo.polimorfismoEx04.entities.Individual;
import polimorfismo.polimorfismoEx04.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual of Company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                Integer numOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome,numOfEmployees));
            }
        }


        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }


        System.out.println();
        System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));

        sc.close();
    }
}
