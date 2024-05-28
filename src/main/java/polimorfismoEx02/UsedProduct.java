package polimorfismoEx02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    //Atributos
    private LocalDate manufactureDate; //Data de fabricação


    //Construtores
    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }


    //Métodos
    @Override
    public String priceTag() {  //preço do produto = etiqueta
        return getName()
                + "(used) $ " //informando na etiqueta que o produto é usado
                + String.format("%.2f", getPrice()) //formatando o preco do produto
                + " (Manufacture Date: )" //informando essa mensagem
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));  // e formatando a data
    }


    //Métodos especiais
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
