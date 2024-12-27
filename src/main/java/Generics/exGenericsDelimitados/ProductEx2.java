package Generics.exGenericsDelimitados;

public class ProductEx2 implements Comparable<ProductEx2> {

    private String name;
    private Double price;

    public ProductEx2(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(ProductEx2 other) {
        return price.compareTo(other.getPrice());
    }
}

