package LogicaDeProgramacao.Composicao.entities;

public class Comment {

    //ATRIBUTOS
    private String text;



    //CONSTRUTOR
    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }



    //MÉTODOS ESPECIAIS
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
