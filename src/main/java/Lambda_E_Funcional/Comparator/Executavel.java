package Lambda_E_Funcional.Comparator;

import java.util.*;

public class Executavel {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        //FORMA DE DEFINIR O COMPARATOR (comparando por função lambda = expressão anónima)
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
