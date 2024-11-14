package polimorfismo.polimorfismoEx01;

import java.util.Date;

public class OutsourcedEmployee extends Employee{ //funcionário terceirizado

    //ATRIBUTOS
    private Double additionalCharge; //despesa adicional


    //CONSTRUTORES
    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    //MÉTODOS
    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }


    //MÉTODOS ESPECIAIS
    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
