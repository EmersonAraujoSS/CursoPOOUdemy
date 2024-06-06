package set.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){  //Aqui eu irei abrir o arquivo

            Set<LogEntry> set = new HashSet<>(); //Escolhi o HashSet porque ele é o mais rápido de todos e não importa a ordem

            String line = br.readLine();  //String para ler a linha do meu arquivo
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
