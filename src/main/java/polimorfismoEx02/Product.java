package polimorfismoEx02;

public class Product {

    //Atributos
    private String name;
    private Double price;


    //Construtores
    public Product(){

    }

    public Product(String name,Double price){
        this.name = name;
        this.price = price;
    }


    //Métodos
    public String priceTag(){
        return name + " $ " + String.format("%.2f",price);   //preço do produto = etiqueta
    }


    //Metodos especiais
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
