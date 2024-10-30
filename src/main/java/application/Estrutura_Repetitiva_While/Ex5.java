package application.Estrutura_Repetitiva_While;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        char resposta;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja permitir (s/n)? ");
            resposta = sc.next().charAt(0);
        }
        while (resposta != 'n');


        sc.close();
    }
}
