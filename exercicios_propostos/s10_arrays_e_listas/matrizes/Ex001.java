package exercicios_propostos.s10_arrays_e_listas.matrizes;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int numNegativos = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] < 0){
                    numNegativos++;
                }
            }
        }

        System.out.println("Main diagonal:");
        for(int i = 0; i < n; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println("\nNegative numbers = " + numNegativos);

        // Quantidade de linhas e colunas Exemplo:
        System.out.println("\nExemplo para saber a quantidade de linhas e colunas:");
        int[][] mat = new int[2][4];
        System.out.println("Quantidade de linhas: " + mat.length);
        System.out.println("Quantidade de colunas: " + mat[1].length);

        sc.close();
    }
}
