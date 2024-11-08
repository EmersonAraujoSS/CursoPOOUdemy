package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex5Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Ex5PessoaEntitie[] vect = new Ex5PessoaEntitie[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Ex5PessoaEntitie(nome, idade, altura);
        }

        double altMedia = 0.0;
        for (int i = 0; i < vect.length; i++) {
            altMedia += vect[i].getAltura() / vect.length;
        }
        System.out.printf("Altura média: %.2f\n", altMedia);


        int nmenores = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16){
                nmenores++;
            }
        }

        double percentualMenores = ((double) nmenores / n) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }



        sc.close();
    }
}
