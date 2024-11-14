package polimorfismo.polimorfismoEx02;

public class ImportedProduct extends Product {

    //Atributos
    private Double customsFee;  //customsFee = taxa de importação


    //Construtores
    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }


    //Métodos
    public Double totalPrice(){
        return getPrice() + customsFee;
    }


    @Override
    public String priceTag() {  //preço do produto = etiqueta
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " Customs Fee = $ "
                + String.format("%.2f" , customsFee)
                + ")";
    }


    //Metodos especiais
    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
