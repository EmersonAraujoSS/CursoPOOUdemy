package LogicaDeProgramacao.Estrutura_Condicional_IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Ex9_Dia_Semana_IfElse {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String dia;

        if (x == 1){
            dia = "Domingo";
        }
        else if (x == 2){
            dia = "Segunda";
        }
        else if (x == 3){
            dia = "Terça";
        }
        else if (x == 4){
            dia = "Quarta";
        }
        else if (x == 5){
            dia = "Quinta";
        }
        else if (x == 6){
            dia = "Sexta";
        }
        else if (x == 7){
            dia = "Sabado";
        }
        else {
            dia = "Valor inválido";
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
