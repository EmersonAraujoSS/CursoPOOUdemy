package polimorfismoEx04.entities;

public class Company extends TaxPayer{

    //Atributos
    private Integer numberOfEmployees; //numero de trabalhadores


    //Construtores
    public Company(){

    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }


    //Metodo sobrescrito de TaxPayer(polimorfismo)
    @Override
    public Double tax() {
        if (numberOfEmployees > 10){
            return getAnualIncome() * 0.14;
        }else {
            return getAnualIncome() * 0.16;
        }
    }


    //Metodos especias
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
