package set.TreeSet;

import java.util.Objects;

public class Product implements Comparable<Product> {

    //Atributos
    private String name;
    private Double price;


    //Construtor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    //Metodos especiais
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }


    @Override
    public String toString() {
        return "Product [" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Product other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase()); //comparando por nome desse produto com o nome de outro produto
                                                                                // toUpperCase = para converter para letra maiuscula
    }

}