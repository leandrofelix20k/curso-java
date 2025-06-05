package exercicios_propostos.s13_heranca_e_polimorfismo.ex02;

public class Product {
    private String name;
    private Double price;

    Product() {

    }

    Product(String name, Double price) {
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
        return name + " $ " + String.format("%.2f", price);
    }
}
