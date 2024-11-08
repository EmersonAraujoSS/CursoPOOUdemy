package LogicaDeProgramacao.Listas;

public class Ex1EmployeeEntitie {


    //ATRIBUTOS
    private Integer id;
    private String nome;
    private Double salario;


    //CONSTRUTORES
    public Ex1EmployeeEntitie() {
    }

    public Ex1EmployeeEntitie(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    //MÉTODOS
    public void increaseSalary(double percentage) {
        salario += salario * percentage / 100;
    }


    //MÉTODOS ESPECIAIS
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}


