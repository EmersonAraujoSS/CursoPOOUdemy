package LogicaDeProgramacao.Vetores;

public class Ex14RentEntitie {


    //ATRIBUTOS
    private String nome;
    private String email;



    //CONSTRUTOR
    public Ex14RentEntitie(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    //MÉTODOS ESPECIAIS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return nome + ", " + email;
    }
}
