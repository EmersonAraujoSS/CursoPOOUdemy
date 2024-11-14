package Heranca.entities;

public class BusinessAccount extends Account{

    //ATRIBUTOS
    private Double loanLimite; //limite de empréstimo


    //CONSTRUTOR
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance);
        this.loanLimite = loanLimite;
    }

    //MÉTODOS
    public void loan(Double amount) {
        if(amount <= loanLimite) {  //LEITURA = SE A QUANTIA QUE EU IREI EMPRESTAR FOR MENOR OU IGUAL AO MEU LIMITE DE EMPRÉSTIMO
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    //MÉTODOS ESPECIAIS
    public Double getLoanLimite() {
        return loanLimite;
    }
    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }
}
