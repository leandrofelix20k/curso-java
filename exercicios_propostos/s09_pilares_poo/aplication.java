package exercicios_propostos.s09_pilares_poo;

import java.util.Locale;
import java.util.Scanner;

public class aplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ContaBancaria contaBancaria;
        String nome, op;
        double deposito, depositoInicial;
        long numeroConta;
        boolean initialDeposit;

        System.out.print("Enter account number: ");
        numeroConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        nome = sc.nextLine();

        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            op = sc.nextLine().toLowerCase();
            initialDeposit = op.equals("y");
        } while(!op.equals("y") && !op.equals("n"));

        if(initialDeposit){
            System.out.print("Enter initial deposit value: ");
            depositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(numeroConta, nome, depositoInicial);
        } else{
            contaBancaria = new ContaBancaria(numeroConta, nome, 0.0);
        }

        System.out.println("\nAccount data: ");
        System.out.println(contaBancaria);

        System.out.print("\nEnter a deposit value: ");
        contaBancaria.depositar(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(contaBancaria);

        System.out.print("\nEnter a withdraw value: ");
        contaBancaria.sacar(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(contaBancaria);

        sc.close();
    }
}
