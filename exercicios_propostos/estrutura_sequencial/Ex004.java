package exercicios_propostos.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFunc, horasTrabalhadas;
		double salario;

		numeroFunc = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salario = sc.nextDouble();

		salario = salario * horasTrabalhadas;

		System.out.printf("NUMBER = %d%n", numeroFunc);
		System.out.printf("SALARY = %.2f%n", salario);

		sc.close();
	}
    
}
