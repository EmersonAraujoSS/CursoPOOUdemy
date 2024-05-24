package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Employe {

    //Atributos
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public List<Employe> employees = new ArrayList<>();


    //Construtores
    public Employe(){

    }

    public Employe(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }


    //Método
    public double payment(){
        return hours * valuePerHour;
    }


    //Metodos especiais
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
}
