package LogicaDeProgramacao.Listas;

import LogicaDeProgramacao.Listas.Ex1EmployeeApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex1EmployeeApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Ex1EmployeeEntitie> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Ex1EmployeeEntitie(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Ex1EmployeeEntitie emp = list.stream().filter(e -> e.getId() == idSalary).findFirst().orElse(null);

        //Integer pos = hasId(list, idSalary);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Ex1EmployeeEntitie e : list) {
            System.out.println(e.toString());
        }

        sc.close();
    }

    public static boolean hasId(List<Ex1EmployeeEntitie> list, int id) {
        Ex1EmployeeEntitie emp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
