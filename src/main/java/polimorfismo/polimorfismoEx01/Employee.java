package polimorfismo.polimorfismoEx01;

public class Employee {

    //ATRIBUTOS
    private String name;
    private Integer hours;
    private Double valuePerHour;


    //CONSTRUTORES
    public Employee(){
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }


    //MÉTODOS
    public double payment(){
        return hours * valuePerHour;
    }


    //MÉTODOS ESPECIAIS
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
