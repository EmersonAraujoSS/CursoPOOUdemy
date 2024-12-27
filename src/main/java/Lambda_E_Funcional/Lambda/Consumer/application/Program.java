package Lambda_E_Funcional.Lambda.Consumer.application;

import Lambda_E_Funcional.Lambda.Consumer.entites.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * factor));  // p.setPrice(p.getPrice() * factor =  Expressão lambda inline

        list.forEach(System.out::println);
    }
}
