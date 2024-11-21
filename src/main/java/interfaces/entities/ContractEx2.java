package interfaces.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractEx2 {

    //ATRIBUTOS
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<InstallmentEx2> installments = new ArrayList<>();


    //CONSTRUCTOR
    public ContractEx2(){
    }

    public ContractEx2(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }


    //MÉTODOS ESPECIAIS
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    public List<InstallmentEx2> getInstallments() {
        return installments;
    }
}
