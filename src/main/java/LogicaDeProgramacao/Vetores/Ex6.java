package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        int qtdPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                qtdPares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);

        sc.close();
    }
}
