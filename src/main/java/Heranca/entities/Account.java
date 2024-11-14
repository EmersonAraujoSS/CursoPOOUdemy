package Heranca.entities;

public class Account {

    //ATRIBUTOS
    private Integer number;
    private String holder; //titular
    protected Double balance; //saldo


    //CONSTRUTORES
    public Account(){
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }


    //MÉTODOS  //withdraw = sacar
    public void withdraw(double amount) { //amount = valor
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void loan(double amount) { //loan = emprestar/empréstimo

    }


    //MÉTODOS ESPECIAIS
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
}
