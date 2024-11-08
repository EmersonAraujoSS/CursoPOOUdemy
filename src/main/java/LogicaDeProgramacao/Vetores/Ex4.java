package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double soma, media;

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("Valores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }
        System.out.printf("\nSoma = %.2f\n", soma);


        media = soma / n;
        System.out.printf("Media = %.2f\n", media);

        sc.close();
    }
}
