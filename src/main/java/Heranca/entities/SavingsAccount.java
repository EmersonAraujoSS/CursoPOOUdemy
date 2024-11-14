package Heranca.entities;

public class SavingsAccount extends Account { //CONTA POUPANÇA

    //ATRIBUTOS
    private Double interestRate; //TAXA DE JUROS


    //CONSTRUTORES
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }


    //MÉTODOS
    public void updateBalance(Double interestRate) { //ATUALIZAR SALDO COM BASE NA TAXA DE JUROS
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }


    //MÉTODOS ESPECIAIS
    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
