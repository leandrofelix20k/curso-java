package exercicios_propostos.s3_estrutura_repeticao;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i = 1; i < num+1; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
