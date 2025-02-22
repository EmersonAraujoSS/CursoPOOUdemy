package Lambda_E_Funcional.Stream.exercicioResolvido.application;

import Lambda_E_Funcional.Stream.exercicioResolvido.entites.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class testeExe {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double media = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size();//reduce vai me permitir fazer a soma

            System.out.println("Preço médio: " + String.format("%.2f", media));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                     .filter(p -> p.getPrice() < media)
                     .map(p -> p.getName())
                     .sorted(comp.reversed())  //aqui eu estou usando o "sorted" para ele organizar por ordem alfabetica // e usei o "comp.reversed" para comparar e organizar em ordem decrescente.
                     .collect(Collectors.toList());

            names.forEach(System.out::println);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
