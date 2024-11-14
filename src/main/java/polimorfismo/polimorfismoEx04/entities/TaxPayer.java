package polimorfismo.polimorfismoEx04.entities;

public abstract class TaxPayer { //Taxa de contribuicao

    //Atributos
    private String name;
    private Double anualIncome;  //Renda anual


    //Construtor
    public TaxPayer(){

    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }


    //Metodos
    public abstract Double tax();


    //Metodos especias
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnualIncome() {
        return anualIncome;
    }
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
