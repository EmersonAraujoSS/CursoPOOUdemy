package arquivos;

import java.io.*;
import java.util.Scanner;

public class FileReaderANDBufferedReader {

    public static void main(String[] args) {

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){   //FileReader = stream de leitura de caracteres a partir de arquivos
                                                                                //BufferedReader = (mais rápido)
            String line = br.readLine(); //readLine serve para ler a linha

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

