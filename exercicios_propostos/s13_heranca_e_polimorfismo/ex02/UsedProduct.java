package exercicios_propostos.s13_heranca_e_polimorfismo.ex02;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getmanufactureDate() {
        return manufactureDate;
    }

    public void setmanufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return getName() + " (used) $ " + String.format("%.2f", getPrice())
                + " (Manufacture date: " + manufactureDate + ")";
    }
}
