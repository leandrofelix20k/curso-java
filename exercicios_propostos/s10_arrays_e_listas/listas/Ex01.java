package exercicios_propostos.s10_arrays_e_listas.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("How many employers will be registered? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("\nEmployer #%d", i+1);
            long id;
            do{
                System.out.print("\nId: ");
                id = sc.nextLong();

                if(findFunc(funcionarios, id) != -1){
                    System.out.println("---Id já cadastrado!---");
                }
            } while(findFunc(funcionarios, id) != -1);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.print("\nEnter the employee id that will have salary increase : ");
        long id = sc.nextLong();
        System.out.print("Enter the percentage: ");
        double porcentagem = sc.nextDouble();
        if(findFunc(funcionarios, id) != -1){
            int indice = findFunc(funcionarios, id);
            funcionarios.get(indice).aumentarSalario(porcentagem);
        } else{
            System.out.println("\n---This id does not exist!");
        }

        System.out.println("\nList of employeers: ");

        for(int i = 0; i < funcionarios.size(); i++){
            System.out.print(funcionarios.get(i));
        }

        sc.close();
    }

    public static int findFunc(List<Funcionario> funcionarios, long id) {
        for(int i = 0;  i < funcionarios.size(); i++){
            if(funcionarios.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}

/*
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
 */
