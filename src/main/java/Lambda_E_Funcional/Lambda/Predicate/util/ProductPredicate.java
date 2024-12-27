package Lambda_E_Funcional.Lambda.Predicate.util;

import Lambda_E_Funcional.Lambda.Predicate.entites.Product;

import java.util.function.Predicate;


public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100;
    }
}
