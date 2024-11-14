package LogicaDeProgramacao.Composicao.entities;

public class ExFixProduct {

    //ATRIBUTOS
    private String name;
    private Double price;


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
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
