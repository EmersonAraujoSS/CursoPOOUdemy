package LogicaDeProgramacao.Vetores;

public class Ex2ProdutEntitie {

    //ATRIBUTOS
    private String nome;
    private double preco;


    //CONSTRUTOR
    public Ex2ProdutEntitie(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    //MÉTODOS ESPECIAIS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
