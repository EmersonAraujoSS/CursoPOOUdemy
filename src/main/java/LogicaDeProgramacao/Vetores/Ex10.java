package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();


        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int soma = 0;
        int npares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                npares++;
            }
        }

        if (npares == 0){
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            double media = (double) soma / npares;
            System.out.printf("MÉDIA DOS PARES = %.1f\n", media);
        }

        sc.close();
    }
}
