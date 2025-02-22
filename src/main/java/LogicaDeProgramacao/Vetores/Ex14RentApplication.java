package LogicaDeProgramacao.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex14RentApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();


        Ex14RentEntitie[] vect = new Ex14RentEntitie[10];
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Ex14RentEntitie(nome,email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].toString());
            }
        }

        sc.close();
    }
}
