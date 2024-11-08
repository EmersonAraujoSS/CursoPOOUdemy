package LogicaDeProgramacao.Composicao.entities;

public class ExFixProduct {

    //ATRIBUTOS
    private String name;
    private double price;


    //CONSTRUTORES
    public ExFixProduct(){
    }

    public ExFixProduct(String name, double price){
        this.name = name;
        this.price = price;
    }


    //MÉTODOS ESPECIAIS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
