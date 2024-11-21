package defaultMethods;

public class BrazilInterestService implements InterestService {

    //ATRIBUTOS
    private double interestRate;


    //CONSTRUTOR
    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }


    //MÉTODOS
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
