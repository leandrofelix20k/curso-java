package exercicios_propostos.s10_arrays_e_listas;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media, soma=0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextInt();
            soma += valores[i];
        }

        media = soma/n;

        System.out.print("\nVALORES = ");
        for(int i = 0; i < n; i++){
            System.out.print(valores[i] + " ");
        }
        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
