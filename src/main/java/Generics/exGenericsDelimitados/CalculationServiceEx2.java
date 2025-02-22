package Generics.exGenericsDelimitados;

import java.util.List;

public class CalculationServiceEx2 {

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()){
            throw new IllegalStateException("Lista vazia");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
