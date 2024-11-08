package LogicaDeProgramacao.Estrutura_Repetitiva_While;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while(idade >= 0){
            soma += idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }
        if (cont > 0){
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        }
        else {
            System.out.println("Impossível calcular");
        }

        sc.close();
    }
}