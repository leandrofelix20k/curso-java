package exercicios_propostos.s10_arrays_e_listas;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double maior;
        int posMaior = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] valores = new double[n];

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextDouble();
        }

        maior = valores[0];

        for(int i = 1; i < valores.length; i++){
            if(valores[i] > maior){
                maior = valores[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posMaior);

        sc.close();
    }
}
