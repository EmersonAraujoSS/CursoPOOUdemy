package polimorfismoEx04.entities;

public class Individual extends TaxPayer{

    //Atributos
    public Double healthExpenditures;  // gastos em saúde


    //Construtor
    public Individual(){

    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }


    //Metodo sobrescrito de TaxPayer(polimorfismo)
    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.0){
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        }else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }


    //Metodos especiais
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
