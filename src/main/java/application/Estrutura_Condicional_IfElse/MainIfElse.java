package application.Estrutura_Condicional_IfElse;

import java.util.Locale;
import java.util.Scanner;

public class MainIfElse {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("Bom dia");
        }
        else  if (hora < 18){ // no else if eu posso porque ele está apenas simplificando a condição usando essa estrutura
            System.out.println("Boa Tarde");
        }
        else { // eu não posso colocar nenhuma condição no else
            System.out.println("Boa Noite");
        }

        sc.close();

    }
}
