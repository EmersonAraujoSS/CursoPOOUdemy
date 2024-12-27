package Generics.set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class SetString {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        set.remove("Tablet");
        set.removeIf(x -> x.length() >= 3); //o removeIf vai remover conforme o meu predicado definido
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set){
            System.out.println(p);
        }
    }
}
