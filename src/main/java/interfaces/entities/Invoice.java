package interfaces.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Invoice {

    //ATRIBUTOS
    private Double basicPayment;
    private Double tax;


    //CONSTRUTORES
    public Invoice(){
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }


    //MÉTODOS
    public Double gettotalPayment(){
        return getBasicPayment() + getTax();
    }


    //MÉTODOS ESPECIAIS
    public Double getBasicPayment() {
        return basicPayment;
    }
    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
}
