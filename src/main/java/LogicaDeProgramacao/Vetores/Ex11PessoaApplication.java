package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex11PessoaApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();


        Ex11PessoaEntitie[] vect = new Ex11PessoaEntitie[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Ex11PessoaEntitie(nome, idade);
        }

        int maioridade = vect[0].getIdade();
        int posicaomaior = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() > maioridade) {
                maioridade = vect[i].getIdade();
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", vect[posicaomaior].getNome());

        sc.close();
    }
}
