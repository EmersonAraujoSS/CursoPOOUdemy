package Generics;

public class EqualsAndHashCode {

    public static void main(String[] args) {

        String a = "Emerson";
        String b = "Araujo";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
    }

    //para eu comparar a igualdade dos objetos posso usar o "equals"
    //para eu comparar a referencia em memória dos objetos para ver se é igual ou não, eu so o "=="
}
