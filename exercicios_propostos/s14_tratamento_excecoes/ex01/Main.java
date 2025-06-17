package exercicios_propostos.s14_tratamento_excecoes.ex01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exercicios_propostos.s14_tratamento_excecoes.ex01.model.entities.Account;
import exercicios_propostos.s14_tratamento_excecoes.ex01.model.exceptions.SaldoInsuficienteException;
import exercicios_propostos.s14_tratamento_excecoes.ex01.model.exceptions.SaqueSuperiorLimiteSaqueException;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount  for withdraw: ");
            double amount = sc.nextDouble();
            account.withDraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values for balance and withdraw limit.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (SaqueSuperiorLimiteSaqueException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }

        sc.close();
    }
}
