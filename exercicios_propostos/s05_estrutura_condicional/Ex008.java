package exercicios_propostos.s05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		float salario,  salarioAbatido, resto, impostoTotal=0;

        salario= scanner.nextFloat();

        salarioAbatido = salario;
        if (salarioAbatido > 4500) {
            resto = salarioAbatido - 4500;
            impostoTotal = resto * 0.28f;
            salarioAbatido = salarioAbatido - resto;
        }
        if (salarioAbatido > 3000) {
            resto = salarioAbatido - 3000;
            impostoTotal = impostoTotal + (resto * 0.18f);
            salarioAbatido = salarioAbatido - resto;
        }
        if (salarioAbatido > 2000) {
            resto = salarioAbatido - 2000;
            impostoTotal = impostoTotal + (resto * 0.08f);
            salarioAbatido = salarioAbatido - resto;
        }

        if (salario <= 2000) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", impostoTotal);
        }

        scanner.close();
	}
}
