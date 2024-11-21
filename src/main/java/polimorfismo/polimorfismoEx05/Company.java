package polimorfismo.polimorfismoEx05;

public class Company extends TaxPayer{

    //ATRIBUTOS
    private Integer numberOfEmployees;


    //CONSTRUTORES
    public Company() {
        super();
    }

    public Company(String name, double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }


    //MÉTODOS
    @Override
    public double tax() {
        if(numberOfEmployees > 10){
            return getAnnualIncome() * 0.14;
        }
        else{
            return getAnnualIncome() * 0.16;
        }
    }


    //MÉTODOS ESPECIAIS
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
