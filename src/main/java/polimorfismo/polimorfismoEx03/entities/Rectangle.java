package polimorfismo.polimorfismoEx03.entities;

import polimorfismo.polimorfismoEx03.enums.Color;

public class Rectangle extends Shape{

    //Atributos
    private Double width;
    private Double height;


    //Construtor
    public Rectangle(double width, double height) {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    //Métodos = sobrecrito de Shape
    @Override
    public double area() {
        return width * height;
    }


    //Metodos especiais
    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
}
