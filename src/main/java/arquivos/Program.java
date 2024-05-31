package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");  //aqui eu estancio a leitura do arquivo
        Scanner sc = null; //vai servir para ler o arquivo
        try {
            sc = new Scanner(file); //aqui eu estou estanciando o scanner, mas passando para ele ler meu arquivo (file)
            while (sc.hasNextLine()) {  //hasNextLine = serve para testar se existe um nova linha no arquivo
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
