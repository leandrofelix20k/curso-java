package exercicios_propostos.s8_introducao_poo.ex002;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.setNome(sc.nextLine());
        System.out.print("Gross salary: ");
        funcionario.setSalarioBruto(sc.nextDouble());
        System.out.print("Tax: ");
        funcionario.setImpostoVulgoLeao(sc.nextDouble());

        System.out.println("\nEmployee: " + funcionario);

        System.out.print("\nWhich percentage to increase salary? ");
        funcionario.incrementarSalario(sc.nextDouble());

        System.out.println("\nUpdated data: " + funcionario);

        sc.close();
    }
}
