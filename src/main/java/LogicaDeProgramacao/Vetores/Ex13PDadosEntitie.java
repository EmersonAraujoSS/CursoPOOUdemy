package LogicaDeProgramacao.Vetores;

public class Ex13PDadosEntitie {


    //ATRIBUTOS
    private double altura;
    private char genero;



    //CONSTRUTOR
    public Ex13PDadosEntitie(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }


    //MÉTODOS ESPECIAIS
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
