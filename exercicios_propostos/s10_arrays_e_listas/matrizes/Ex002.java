package exercicios_propostos.s10_arrays_e_listas.matrizes;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j< n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] == x){
                    System.out.println("Position " + i + "," + j + ":");
                    if(j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if(j < n-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if(i < m-1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }

        /*
        for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
         */

        sc.close();
    }
}
