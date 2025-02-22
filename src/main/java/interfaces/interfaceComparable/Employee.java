package interfaces.interfaceComparable;

public class Employee implements Comparable<Employee> {

    //atributos
    private String name;
    private Double salary;


    //construtor
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }


    //métodos especiais
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
