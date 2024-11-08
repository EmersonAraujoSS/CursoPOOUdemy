package LogicaDeProgramacao.Vetores;

public class Ex11PessoaEntitie {


    //ATRIBUTOS
    private String nome;
    private int idade;



    //CONSTRUTOR
    public Ex11PessoaEntitie(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    //MÉTODOS ESPECIAIS
     public String getNome() {
        return nome;
     }
     public void setNome(String nome) {
        this.nome = nome;
     }
     public int getIdade() {
        return idade;
     }
     public void setIdade(int idade) {
        this.idade = idade;
     }
}
