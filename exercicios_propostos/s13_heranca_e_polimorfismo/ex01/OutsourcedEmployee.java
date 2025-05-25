package exercicios_propostos.s13_heranca_e_polimorfismo.ex01;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String nome, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(nome, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + (additionalCharge * 1.1);
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
