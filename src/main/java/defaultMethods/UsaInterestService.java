package defaultMethods;

public class UsaInterestService implements InterestService {

    //ATRIBUTOS
    private double interestRate;


    //CONSTRUTOR
    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }


    //MÉTODOS
    @Override
    public double getInterestRate() {
        return interestRate;
     }
}
