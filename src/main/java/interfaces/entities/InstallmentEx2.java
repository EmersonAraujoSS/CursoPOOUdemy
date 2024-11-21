package interfaces.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InstallmentEx2 { //parcela

    //ATRIBUTOS
    private LocalDate installment;
    private Double amount; //valor =  valor da parcela
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    //CONSTRUCTOR
    public InstallmentEx2() {
    }

    public InstallmentEx2(LocalDate installment, Double amount) {
        this.installment = installment;
        this.amount = amount;
    }


    //MÉTODOS ESPECIAIS
    public LocalDate getInstallment() {
        return installment;
    }
    public void setInstallment(LocalDate installment) {
        this.installment = installment;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return
                installment.format(dtf) + " - "
                + String.format("%.2f", amount);
    }
}
