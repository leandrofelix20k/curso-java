package exercicios_propostos.s4_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num;
		double x, y, z, mediaPonderada;

		num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();

			mediaPonderada = ((x * 2) + (y * 3) + (z * 5)) / 10;

			System.out.printf("%.1f%n", mediaPonderada);
		}

		sc.close();
	}
}
