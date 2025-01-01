package exercicios_propostos.s3_estrutura_repeticao;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, x, in=0, out=0;

		num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			x = sc.nextInt();

			if(x >= 10 && x <=20) {
				in++;
			} else {
				out++;
			}
		}

		sc.close();

		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}