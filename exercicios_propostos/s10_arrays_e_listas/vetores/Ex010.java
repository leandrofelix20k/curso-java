package exercicios_propostos.s10_arrays_e_listas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        boolean[] aprovados = new boolean[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite nome, primeira e segunda nota do 1o aluno:");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();

            if((notas1[i] + notas2[i])/2 >= 6.0){
                aprovados[i] = true;
            }
        }

        for(int i = 0; i < n; i++){
            if(aprovados[i]){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
