package exercicios_propostos.s10_arrays_e_listas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] valores = new double[n];
        double mediaPares = 0;
        int cont = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextDouble();

            if(valores[i] % 2 == 0){
                mediaPares += valores[i];
                cont++;
            }
        }

        if(cont == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares /= cont;
            System.out.printf("MEDIA DO VETOR = %.1f", mediaPares);
        }

        sc.close();
    }
}
