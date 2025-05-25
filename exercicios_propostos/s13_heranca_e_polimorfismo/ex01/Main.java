package exercicios_propostos.s13_heranca_e_polimorfismo.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("Enter ther number of employees: ");
        int numEmployess = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i < numEmployess; i++) {
            System.out.printf("Employee #%d data:\n", i + 1);

            System.out.printf("Outsourced (y/n)? ");
            String op = sc.next().toLowerCase();
            sc.nextLine();

            if(op.equals("y")) {
                System.out.printf("Name: ");
                String nome = sc.nextLine();
                System.out.printf("Hours: ");
                int hours = sc.nextInt();
                System.out.printf("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.printf("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(nome, hours, valuePerHour, additionalCharge));
            } else {
                System.out.printf("Name: ");
                String nome = sc.nextLine();
                System.out.printf("Hours: ");
                int hours = sc.nextInt();
                System.out.printf("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                employees.add(new Employee(nome, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS:");
       for(Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}
