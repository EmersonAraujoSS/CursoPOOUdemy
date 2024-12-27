package Lambda_E_Funcional.Lambda.Consumer.util;

import Lambda_E_Funcional.Lambda.Consumer.entites.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {


    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
