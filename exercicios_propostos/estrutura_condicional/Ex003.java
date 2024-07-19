package exercicios_propostos.estrutura_condicional;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, maior, menor;

		x = sc.nextInt();
		y = sc.nextInt();

		if(x > y) {
			maior = x;
			menor = y;
		} else {
			maior = y;
			menor = x;
		}

		if(maior % menor == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}
}
