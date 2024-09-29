package exercicios_propostos.s10_arrays_e_listas.vetores.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pensionato[] pensionato = new Pensionato[10];
        int nEstudantes;

        System.out.print("How many rooms will be rented? ");
        nEstudantes = sc.nextInt();

        for(int i = 0; i < nEstudantes; i++){
            System.out.printf("Rent #%d\n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int quarto = sc.nextInt();

            pensionato[quarto] = new Pensionato(nome, email, quarto);
        }

        System.out.println("\nBusy rooms:");
        for (Pensionato value : pensionato) {
            if(value != null){
                System.out.println(value);
            }
        }

        sc.close();
    }
}
