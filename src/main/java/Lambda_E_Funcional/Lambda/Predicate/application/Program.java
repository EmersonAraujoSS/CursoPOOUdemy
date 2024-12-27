package Lambda_E_Funcional.Lambda.Predicate.application;

import Lambda_E_Funcional.Lambda.Predicate.entites.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);  // p -> p.getPrice() >= min =  Expressão lambda inline

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
