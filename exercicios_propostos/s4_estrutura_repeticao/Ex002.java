package exercicios_propostos.s3_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		do {
			x = sc.nextDouble();
			y = sc.nextDouble();

			if(x > 0.0) {
				if(y > 0.0) {
					System.out.println("primeiro");
				} else if(y < 0.0){
					System.out.println("quarto");
				}
			} else if(x < 0.0){
				if(y > 0.0) {
					System.out.println("segundo");
				} else if(y < 0.0){
					System.out.println("terceiro");
				}
			}
		} while(x != 0 && y != 0);

		sc.close();
	}
}
