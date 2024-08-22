package exercicios_propostos.s10_arrays_e_listas;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] valores = new int[n];

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < valores.length; i++){
            if(valores[i] < 0){
                System.out.println(valores[i]);
            }
        }

        sc.close();
    }
}
