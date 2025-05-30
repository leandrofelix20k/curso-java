package exercicios_propostos.s05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num;

		num = sc.nextDouble();

		if(num > 0.0 && num <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if(num > 0.0 && num <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if(num > 0.0 && num <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else if(num > 0.0 && num <= 100.0) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}
}
