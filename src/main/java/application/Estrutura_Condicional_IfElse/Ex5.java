package application.Estrutura_Condicional_IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int horaTotal;

        if (horaInicial < horaFinal) {
            horaTotal = horaFinal - horaInicial;
        }
        else {
            horaTotal = 24 - horaInicial + horaFinal;
        }

        System.out.println("O Jogo durou " + horaTotal + " horas");

        sc.close();
    }
}
