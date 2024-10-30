package application.Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
            y += 5;
            System.out.println(y);
        }
    }
}
