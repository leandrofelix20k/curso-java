package exercicios_propostos.s4_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num;
		double x, y, resultado;

		num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();

			if(y != 0) {
				resultado = x / y;
				System.out.printf("%.1f%n", resultado);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		sc.close();
	}
}
