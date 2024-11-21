package interfaces.services;

import interfaces.entities.ContractEx2;
import interfaces.entities.InstallmentEx2;

import java.time.LocalDate;

public class ContractServiceEx2 {

    //ATRIBUTOS
    private OnlinePaymentServiceEx2 onlinePaymentServiceEx2;


    //CONSTRUTORES
    public ContractServiceEx2(OnlinePaymentServiceEx2 onlinePaymentServiceEx2) {
        this.onlinePaymentServiceEx2 = onlinePaymentServiceEx2;
    }


    //MÉTODOS
    public void processContract(ContractEx2 contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate duoDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentServiceEx2.interest(basicQuota, i); //calculo do juros de cada mês
            double fee = onlinePaymentServiceEx2.paymentFee(basicQuota + interest); //calculo da taxa de juros de cada mês
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new InstallmentEx2(duoDate, quota));
        }


    }
}
