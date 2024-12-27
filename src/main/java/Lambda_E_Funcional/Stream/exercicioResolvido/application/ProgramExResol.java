package Lambda_E_Funcional.Stream.exercicioResolvido.application;

import Lambda_E_Funcional.Stream.exercicioResolvido.entites.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramExResol {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){ //Aqui eu irei abrir o arquivo

            List<Product> list = new ArrayList<>(); //estanciando lista de produtos
            String line = br.readLine();  //String para ler a linha do meu arquivo

            while (line != null){
                String[] fields = line.split(","); //Criando vetor de string  // o split divide meu fields em dois, separando por virgula
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); //aqui ele esta adicionando na minha lista e passando o construtor
                line = br.readLine(); //ler a proxima linha ate acabar com o arquivo
            }

            double media = list.stream()
                    .map(p -> p.getPrice()) //aqui eu irei usar o Generics.Map, porque para cada produto eu vou pegar o preco
                    .reduce(0.0, (x, y) -> x + y ) / list.size();

            System.out.println("Average price(preco medio): " + String.format("%.2f" , media));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()); //aqui eu estou comparando s1 com s2 independente de letra maiuscula

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < media)
                    .map(p -> p.getName())
                    .sorted(comp.reversed()) //aqui eu estou usando o "sorted" para ele organizar por ordem alfabetica // e usei o "comp.reversed" para comparar e organizar em ordem decrescente
                    .collect(Collectors.toList()); // e aqui eu estou transformando essa stream em lista

            names.forEach(System.out::println);


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
