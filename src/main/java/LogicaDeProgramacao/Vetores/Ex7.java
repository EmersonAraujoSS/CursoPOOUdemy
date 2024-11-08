package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double vlmaior = 0.0;
        int posicao = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > vlmaior) {
                vlmaior = vect[i];
                posicao = i;
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f\n", vlmaior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

        sc.close();
    }
}
