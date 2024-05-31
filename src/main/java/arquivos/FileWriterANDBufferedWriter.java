package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterANDBufferedWriter {

    public static void main(String[] args) {

        //Aqui irei criar um arquivo

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };  //estanciei meu vetor, passando esses valores

        String path = "C:\\temp\\out.txt"; // caminho que vai ficar meu arquivo

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) { //LEITURA: para cada String line, contido no meu vetor lines
                bw.write(line); //aqui ele escreve
                bw.newLine(); //aqui ele pula uma linha
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
