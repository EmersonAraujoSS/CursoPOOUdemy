package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex13PDadosApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double maioralt, menoralt, mediaaltmulh, alturafemtotal;
        int nhomens, nmulheres;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Ex13PDadosEntitie[] vect = new Ex13PDadosEntitie[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            char genero = sc.next().charAt(0);
            vect[i] = new Ex13PDadosEntitie(altura, genero);
        }


        menoralt = vect[0].getAltura();
        maioralt = vect[0].getAltura();
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAltura() > maioralt) {
                maioralt = vect[i].getAltura();
            }
            if (vect[i].getAltura() < menoralt) {
                menoralt = vect[i].getAltura();
            }
        }

        nhomens = 0;
        nmulheres = 0;
        alturafemtotal = 0;
        for (int i = 0; i < vect.length; i++) {
           if (vect[i].getGenero() == 'M'){
               nhomens++;
           }
           else {
               nmulheres++;
               alturafemtotal += vect[i].getAltura();
           }
        }

        mediaaltmulh = alturafemtotal / nmulheres;

        System.out.printf("Menor altura = %.2f\n", menoralt);
        System.out.printf("Maior altura = %.2f\n", maioralt);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaaltmulh);
        System.out.printf("Numero de homens = %d\n", nhomens);

        sc.close();
    }
}
