package Lambda_E_Funcional.Stream.exercicoFixacao;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class programTesteRevisao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<EmployeeFuncionarios> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new EmployeeFuncionarios(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> email = list.stream()
                    .filter(s -> s.getSalary() > salary)
                    .map(s -> s.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than "+String.format("%.2f", salary) + ":");
            email.forEach(System.out::println);

            double sum = list.stream()
                    .filter(s -> s.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (a, b) -> a + b);

            System.out.print("Sum of salary of people whose name starts with 'M': "+String.format("%.2f", sum));


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }




        sc.close();
    }
}
