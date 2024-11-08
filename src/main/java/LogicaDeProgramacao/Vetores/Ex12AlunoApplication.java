package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex12AlunoApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Ex12AlunoEntitie[] vect = new Ex12AlunoEntitie[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vect[i] = new Ex12AlunoEntitie(nome, nota1, nota2);
        }

        double media;
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < vect.length; i++) {
            media = (vect[i].getNota1() + vect[i].getNota2()) / 2;

            if (media >= 6.0){
                System.out.printf("%s\n", vect[i].getNome());
            }
        }

        sc.close();
    }
}
