package exercicios_propostos.introducao_poo.ex004;

public class CurrencyConverter {
    private static double iof = 0.06;

    public static double dollarToReal(double amount, double dollarPrice){
        return amount * dollarPrice * (1.0 + iof);
    }
}
