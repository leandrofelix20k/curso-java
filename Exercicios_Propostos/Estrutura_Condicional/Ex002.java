package Exercicios_Propostos.Estrutura_Condicional;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		num = sc.nextInt();

		if(num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}
}
