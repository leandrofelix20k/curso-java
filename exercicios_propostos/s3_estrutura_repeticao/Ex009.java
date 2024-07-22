package exercicios_propostos.s3_estrutura_repeticao;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
