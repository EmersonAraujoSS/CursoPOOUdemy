package polimorfismo.polimorfismoEx02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExecutavelExemplo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();  // estanciando minha lista de produtos

        System.out.print("Enter the number of products: ");  //informar quantos produto sao
        int n = sc.nextInt(); //criando a variavel para ler o numero de produtos

        for(int i = 1; i <=n; i++) {  //for do meu numero de produtos
            System.out.println("Dados do produto #" + i + ":");
            System.out.print("Common, used or imported (c/u/i): ");  //Common = comum / used = usado / imported = importado
            char type = sc.next().charAt(0); // lê meu sigla de produtos
            sc.nextLine(); // pula a linha
            System.out.print("Name: ");  //le o nome
            String name = sc.nextLine(); // variavel para ler o nome
            System.out.print("Price: "); // le o preco
            double price = sc.nextDouble(); // variavel para ler o preco

            if (type == 'c') { //LEITURA DO IF = SE MEU TIPO FOR IGUAL A 'C'"
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Taxa de importacao: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }

        }                             // SEMPRE CRIO UM "IF" PARA ELE ADICIONAR OS PRODUTOS NA LISTA E CRIO UM "FOR" PARA ELE PERCORRER A LISTA

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO: ");
        for (Product prod : list){  //aqui ele vai percorrer a minha lista de produtos e ver qual "METODO" que ele vai acessar
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
