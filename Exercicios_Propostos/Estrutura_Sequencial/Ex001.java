package Exercicios_Propostos.Estrutura_Sequencial;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		x = sc.nextInt();
		y = sc.nextInt();

		System.out.printf("SOMA = %d%n", x+y);

		sc.close();
	}

}
