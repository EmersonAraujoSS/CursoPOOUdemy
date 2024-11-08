package LogicaDeProgramacao.Composicao.application;

import LogicaDeProgramacao.Composicao.entities.ExFixClient;
import LogicaDeProgramacao.Composicao.entities.ExFixOrder;
import LogicaDeProgramacao.Composicao.entities.ExFixOrderItem;
import LogicaDeProgramacao.Composicao.entities.ExFixOrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderApplication {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        ExFixClient order = new ExFixClient(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status:");
        ExFixOrderStatus status = ExFixOrderStatus.valueOf(sc.next());

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

        }





        sc.close();
    }
}
