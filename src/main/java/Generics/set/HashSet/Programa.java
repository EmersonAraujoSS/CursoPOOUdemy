package Generics.set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Programa {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("Tv", 900.00));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Notebook", 1200.00));

        Product p = new Product("Notebook", 1200.00);

        System.out.println(set.contains(p));
    }
}
