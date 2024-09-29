package exercicios_propostos.s10_arrays_e_listas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont=0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] valores = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES: ");
        for(int i = 0; i < n; i++){
            if(valores[i] % 2 == 0){
                System.out.print(valores[i] + " ");
                cont += 1;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + cont);

        sc.close();
    }
}
