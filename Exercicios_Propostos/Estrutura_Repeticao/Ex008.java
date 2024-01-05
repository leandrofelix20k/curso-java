package Exercicios_Propostos.Estrutura_Repeticao;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, fatorial;

		n = sc.nextInt();
		fatorial = n;

		for(int i = 1; i < n; i++) {
			if(n == 0) {
				fatorial = 1;
			} else {
				fatorial *= (n-i);
			}
		}

		sc.close();

		System.out.println(fatorial);
	}
}
