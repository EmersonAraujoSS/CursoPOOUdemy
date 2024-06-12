package Lambda.Function.util;

import Lambda.Function.entites.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {


    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();  //toUpperCase = é o nome em caixa alta
    }
}
