package application.Estrutura_Condicional_IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é ímpar");
        }
    }
}
