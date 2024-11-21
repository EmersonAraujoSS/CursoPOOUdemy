package polimorfismo.polimorfismoEx05;

public class Individual extends TaxPayer{

    //ATRIBUTO
    private Double healthExpenditures; //Despesas em saúde


    //CONSTRUTORES
    public Individual() {
        super();
    }

    public Individual(String name, double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }


    //MÉTODOS
    @Override
    public double tax() {
        if (getAnnualIncome() < 20000.00){
            return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }


    //MÉTODOS ESPECIAIS
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
