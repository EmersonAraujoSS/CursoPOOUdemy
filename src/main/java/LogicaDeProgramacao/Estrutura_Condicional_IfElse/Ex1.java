package LogicaDeProgramacao.Estrutura_Condicional_IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextFloat();
        double nota2 = sc.nextFloat();

        double notaFinal = nota1 + nota2;

        System.out.printf("Nota final = %.1f%n", notaFinal);
        if (notaFinal < 60) {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
