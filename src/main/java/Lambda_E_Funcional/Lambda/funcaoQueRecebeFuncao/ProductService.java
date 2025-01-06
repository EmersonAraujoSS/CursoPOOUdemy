package Lambda_E_Funcional.Lambda.funcaoQueRecebeFuncao;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0;
        for (Product p : list) {
            if (criteria.test(p)) {  //aqui eu estou fazendo um teste genérico de qualquer predicado que foi recebido como paramatro
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
