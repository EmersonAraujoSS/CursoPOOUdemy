package polimorfismo;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employe> list = new ArrayList<>(); //Aqui estou estanciando minha lista

        System.out.print("Enter the number of employes: ");  //Aqui estou escrevendo o meu numero de trabalhadores
        int n = sc.nextInt(); // Aqui estou lendo o meu numero de trabalhadores (sempre tenho que criar uma variavel para ler)

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);  //Aqui está lendo a minha variavel de se ele é "y ou n"
            System.out.print("Name: ");
            sc.nextLine(); //aqui é para consumir a linha que estava pendente e ir para a outra linha
            String name = sc.nextLine(); //aqui ele pula outra linha
            System.out.print("Hours: ");  //sempre escrevo na tela
            int hours = sc.nextInt(); // e crio a variavel para ler o que está escrito na tela
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y'){  //aqui está minha condicao de que se ele for "Y"
                System.out.print("Additional charge: "); //Eu escrevo isso na tela
                double additionalCharge = sc.nextDouble(); //e aqui é minha variavel para ver o que está escrito na tela
                list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge)); // e aqui eu estou adicionando na minha lista
            }else {                                                                           //aqui estou passando meu construtor da minha classe "OutsourceEmployee"
                list.add(new Employe(name, hours, valuePerHour)); //aqui estou passando meu construtor da minha classe "OutsourceEmployee"
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employe employee : list){  //aqui ele vai percorrer a minha lista de Employe = funcionarios // employee = é o nome da minha lista
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}
