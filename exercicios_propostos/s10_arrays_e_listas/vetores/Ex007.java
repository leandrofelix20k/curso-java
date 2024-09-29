package exercicios_propostos.s10_arrays_e_listas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] valores = new double[n];
        double media = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextDouble();

            media += valores[i];
        }

        media /= valores.length;
        System.out.printf("\n\nMEDIA DO VETOR = %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < n; i++){
            if(valores[i] < media){
                System.out.println(valores[i]);
            }
        }

        sc.close();
    }
}
