package exercicios_propostos.s13_heranca_e_polimorfismo.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.printf("Tax payer #%d data: ", i);

            System.out.print("Individual or company (i/c)? ");
            char op = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Annual income: ");
            Double rendaAnual = sc.nextDouble();

            if(op == 'i' ) {
                System.out.print("Health expenditures: ");
                Double gastosSaude = sc.nextDouble();

                pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if(op == 'c') {
                System.out.print("Number of employees: ");
                int numeroFuncionarios = sc.nextInt();

                pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        System.out.print("\nTAXES PAID:\n");
        for(Pessoa p : pessoas) {
            System.out.println(p);
        }

        sc.close();
    }
}
