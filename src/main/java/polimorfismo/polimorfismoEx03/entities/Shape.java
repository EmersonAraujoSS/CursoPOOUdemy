package polimorfismo.polimorfismoEx03.entities;

import polimorfismo.polimorfismoEx03.enums.Color;

public abstract class Shape {

    //Atributos
    private Color color;


    //Construtores
    public Shape(){

    }

    public Shape(Color color) {
        this.color = color;
    }


    //Métodos (METODO ABSTRATO, DECLARADO MAS NAÕ IMPLEMENTADO NA PROJENITORA)
    //SE EU TIVER PELO MENOS UM MÉTODO ABSTRATO, A MINHA CLASSE TAMBÉM TEM QUE SER ABSTRATA
    public abstract double area();


    //Metodos especiais
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
