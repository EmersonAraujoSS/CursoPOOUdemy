package Lambda_E_Funcional.Lambda.Function.entites;

public class Product {

    //Atributos
    private String name;
    private Double price;


    //Construtor
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
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


    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
