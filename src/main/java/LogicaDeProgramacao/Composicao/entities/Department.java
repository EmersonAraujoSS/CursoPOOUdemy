package LogicaDeProgramacao.Composicao.entities;

public class Department {

    //ATRIBUTOS
    private String name;


    //CONSTRUTOR
    public Department(String name) {
        this.name = name;
    }


    //MÉTODOS ESPECIAIS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
