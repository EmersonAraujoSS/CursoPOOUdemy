package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employe> list = new ArrayList<>();

        System.out.println("Enter the number of employes");
        int n = sc.nextInt();


        sc.close();
    }
}
