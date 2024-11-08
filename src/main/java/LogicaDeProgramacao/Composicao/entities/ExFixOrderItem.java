package LogicaDeProgramacao.Composicao.entities;

public class ExFixOrderItem {

    //ATRIBUTOS
    private Integer quantity;
    private Double price;
    private ExFixProduct product;


    //CONSTRUTOR
    public ExFixOrderItem(){
    }

    public ExFixOrderItem(Integer quantity, Double price, ExFixProduct product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //MÉTODOS
    public double subTotal(){
        return quantity * price;
    }


    //MÉTODOS ESPECIAIS
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public ExFixProduct getProduct() {
        return product;
    }
    public void setProduct(ExFixProduct product) {
        this.product = product;
    }
}
