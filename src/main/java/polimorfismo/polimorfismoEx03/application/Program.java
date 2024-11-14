package polimorfismo.polimorfismoEx03.application;

import polimorfismo.polimorfismoEx03.entities.Circle;
import polimorfismo.polimorfismoEx03.entities.Rectangle;
import polimorfismo.polimorfismoEx03.entities.Shape;
import polimorfismo.polimorfismoEx03.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>(); //vou armazenar os dados na lista
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

        }


        sc.close();

    }
}
