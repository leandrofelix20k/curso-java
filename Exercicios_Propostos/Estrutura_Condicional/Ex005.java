package Exercicios_Propostos.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoProduto, quantidade;
		double precoTotal;

		codigoProduto = sc.nextInt();
		quantidade = sc.nextInt();

		switch (codigoProduto) {
		case 1:
			precoTotal = quantidade * 4.0;
			break;
		case 2:
			precoTotal = quantidade * 4.5;
			break;
		case 3:
			precoTotal = quantidade * 5.0;
			break;
		case 4:
			precoTotal = quantidade * 2.0;
			break;
		case 5:
			precoTotal = quantidade * 1.5;
			break;
		default:
			precoTotal = 0;
			break;
		}

		System.out.printf("Total: R$ %.2f%n", precoTotal);

		sc.close();
	}
}
