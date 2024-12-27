package Generics.exGenericsDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationCalculationEx2 {

    public static void main(String[] args) {

        List<ProductEx2> list = new ArrayList<>();

        String path = "C:\\Users\\emerson.araujo\\Documents\\PooMaiorTeste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new ProductEx2(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            ProductEx2 x = CalculationServiceEx2.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(x);

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
