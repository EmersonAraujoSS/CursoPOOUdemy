package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); //aqui eu vou buscar a minha lista de pastas
        System.out.println("FOLDERS: ");
        for (File folder : folders) { //LEITURA: para cada FILE folder, contido no meu vetor folders
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // aqui eu vou buscar a minha lista de arquivos
        System.out.println("FILES: ");
        for (File file : files) {  //LEITURA: para cada FILE file, contido no meu vetor files
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();  //aqui eu estou criando a sub pasta com o nome subdir  // mkdir = operacao que serve para criar um novo diretorio
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
