package exercicios_propostos.s06_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadePeca1, quantidadePeca2;
		double  precoPeca1,precoPeca2, precoFinal;

		sc.nextInt(); // Read and discard codPeca1 as it is not used
		quantidadePeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();

		sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();

		precoFinal = quantidadePeca1 * precoPeca1 + quantidadePeca2 * precoPeca2;

		System.out.printf("VALOR A PAGAR: %.2f%n", precoFinal);

		sc.close();
	}
    
}
