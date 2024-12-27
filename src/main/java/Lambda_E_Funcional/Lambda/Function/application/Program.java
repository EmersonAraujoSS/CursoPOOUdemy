package Lambda_E_Funcional.Lambda.Function.application;

import Lambda_E_Funcional.Lambda.Function.entites.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

       List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); //Map = a função Generics.Map ela pega uma coleção de valores e aplica a cada um dos valores da coleção
        //p -> p.getName().toUpperCase() = funcao lambda                                                            // a função que tiver entre parenteses nesse caso "UpperCaseName"

       names.forEach(System.out::println);

    }
}
