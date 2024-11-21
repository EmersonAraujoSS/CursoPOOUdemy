package interfaces.entities;

public class Vehicle {

    //ATRIBUTOS
    private String model;


    //CONSTRUTORES
    public Vehicle(){
    }

    public Vehicle(String model){
        this.model = model;
    }


    //MÉTODOS ESPECIAIS
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
