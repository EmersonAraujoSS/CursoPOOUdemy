package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }


        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }


        double media = soma / n;
        System.out.printf("\nMÉDIA DO VETOR = %.3f%n", media);


        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        sc.close();
    }
}
