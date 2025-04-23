package exercicios_propostos.s08_introducao_poo.ex004;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoDolar, montante;

        System.out.print("What is the dollar price? ");
        precoDolar = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        montante = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(montante, precoDolar));

        sc.close();
    }
}
