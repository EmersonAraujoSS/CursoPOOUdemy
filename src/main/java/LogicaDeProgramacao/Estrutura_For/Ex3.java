package LogicaDeProgramacao.Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = x + 2;

        for (int i = 0; i < x; i++) {
            System.out.println(x + " " + y);
            y += i;
        }

        sc.close();
    }
}
