package Lambda.Predicate.util;

import Lambda.Predicate.entites.Product;

import java.util.function.Predicate;


public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100;
    }
}
