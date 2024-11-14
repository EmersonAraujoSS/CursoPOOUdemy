package LogicaDeProgramacao.Composicao.application;

import LogicaDeProgramacao.Composicao.entities.*;

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
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        ExFixClient client = new ExFixClient(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        ExFixOrderStatus status = ExFixOrderStatus.valueOf(sc.next()); //valueOf = converte o valor do meu String para meu tipo Enum

        ExFixOrder order = new ExFixOrder(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            ExFixProduct product = new ExFixProduct(productName, price);
            ExFixOrderItem it = new ExFixOrderItem(quantity, price, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order.toString());

        sc.close();
    }
}
