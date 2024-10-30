package application.Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int produto = i * x;
            System.out.println(i + " x " + x + " = " + produto);
        }

        sc.close();
    }
}
