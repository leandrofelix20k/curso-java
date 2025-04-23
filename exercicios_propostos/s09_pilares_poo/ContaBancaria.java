package exercicios_propostos.s09_pilares_poo;

public class ContaBancaria {
    private long numero;
    private String titular;
    private double saldo;

    public ContaBancaria(long numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public long getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        if(valor <= 0.0) {
            System.out.println("\nError: O valor a ser depositado tem que ser maior que $0,00");
        } else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor <= 0.0) {
            System.out.println("\nError: O valor a ser sacado tem que ser maior que $0,00");
        } else{
            this.saldo -= valor + 5;
        }
    }

    @Override
    public String toString(){
        return "Account "
                + numero
                + ", Holder: "
                + titular
                + ", Balance: $"
                + String.format("%.2f", saldo);
    }
}
