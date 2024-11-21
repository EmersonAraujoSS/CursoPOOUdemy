package interfaces.interfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class programNome {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        String path = "C:\\Users\\emerson.araujo\\Documents\\PooNomeTeste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            while (name != null) {
                lista.add(name);
                name = br.readLine();
            }
            Collections.sort(lista);
            for (String s : lista) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
