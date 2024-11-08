package LogicaDeProgramacao.Vetores;

public class Ex5PessoaEntitie {

    //ATRIBUTOS
    private String nome;
    private int idade;
    private double altura;


    //CONSTRUTOR
    public Ex5PessoaEntitie(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
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
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
