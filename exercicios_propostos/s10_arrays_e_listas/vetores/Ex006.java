package exercicios_propostos.s10_arrays_e_listas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        double[][] vetores = new double[2][n];
        double[] soma = new double[n];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    System.out.println("Digite os valores do vetor A:");
                } else if(i == 1 && j == 0){
                    System.out.println("Digite os valores do vetor B:");
                }

                vetores[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            soma[i] = vetores[0][i] + vetores[1][i];
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < soma.length; i++){
            System.out.println(soma[i]);
        }

        sc.close();
    }
}
