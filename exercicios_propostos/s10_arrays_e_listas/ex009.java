package exercicios_propostos.s10_arrays_e_listas;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] pessoas = new String[n];
        int[] idades = new int[n];
        String pessoaMaisVelha="";
        int idadePessoaMaisVelha=0;

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa:", i+1);
            System.out.print("\nnome: ");
            sc.nextLine();
            pessoas[i] = sc.nextLine();
            System.out.print("idade: ");
            idades[i] = sc.nextInt();

            if(i == 0){
                pessoaMaisVelha = pessoas[i];
                idadePessoaMaisVelha = idades[i];
            } else{
                if(idades[i] > idadePessoaMaisVelha){
                    pessoaMaisVelha = pessoas[i];
                    idadePessoaMaisVelha = idades[i];
                }
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);

        sc.close();
    }
}
