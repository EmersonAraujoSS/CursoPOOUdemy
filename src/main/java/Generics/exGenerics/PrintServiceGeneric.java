package Generics.exGenerics;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGeneric<T> {

    //ATRIBUTOS
    private List<T> list = new ArrayList<>();


    //MÉTODOS
    public void addValue(T value) {
        list.add(value);
    }

    public T first(){
        if (list.isEmpty()){
            throw new IllegalArgumentException("Lista vazia");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }

}
