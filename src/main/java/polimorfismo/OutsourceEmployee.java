package polimorfismo;


public class OutsourceEmployee extends Employe {

    //Atributos
    private Double additionalCharge;


    //Construtores
    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    //Métodos(Sobrescrito = Polimorfismo)
    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    //Métodos especiais
    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
