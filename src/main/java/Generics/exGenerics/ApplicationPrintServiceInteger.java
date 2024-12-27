package Generics.exGenerics;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationPrintServiceInteger {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        PrintServiceInteger<Integer> ps = new PrintServiceInteger();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
