package polimorfismoEx03.entities;

import polimorfismoEx03.enums.Color;

public class Circle extends Shape{

    //Atributos
    private Double radius;


    //Construtor
    public Circle(double radius) {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }


    //Metodo (sobrescrito de shape)
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }


    //Metodos especiais
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
