package exercicios_propostos.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1, quantidadePeca1, codPeca2, quantidadePeca2;
		double  precoPeca1,precoPeca2, precoFinal;

		codPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();

		codPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();

		precoFinal = quantidadePeca1 * precoPeca1 + quantidadePeca2 * precoPeca2;

		System.out.printf("VALOR A PAGAR: %.2f%n", precoFinal);

		sc.close();
	}
    
}
