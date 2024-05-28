package polimorfismoEx03.entities;

import polimorfismoEx03.enums.Color;

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
    public abstract double area();


    //Metodos especiais
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
