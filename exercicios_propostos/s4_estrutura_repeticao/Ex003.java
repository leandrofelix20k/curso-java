package exercicios_propostos.s4_estrutura_repeticao;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipoCombustivel, alcool=0, gasosa=0, diesel=0;

		do {
			tipoCombustivel = sc.nextInt();

			switch (tipoCombustivel) {
			case 1:
				alcool++;
				break;
			case 2:
				gasosa++;
				break;
			case 3:
				diesel++;
				break;
			}

		} while(tipoCombustivel != 4);

		sc.close();

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasosa);
		System.out.printf("Diesel: %d%n", diesel);
	}
}
