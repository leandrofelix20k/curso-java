package exercicios_propostos.s10_arrays_e_listas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mediaAltura=0, porcentagem=0;

        System.out.print("Quantas pessoas serao digitadas? ");
        int numPessoas = sc.nextInt();
        String[] nomes = new String[numPessoas];
        int[] idade = new int[numPessoas];
        double[] altura = new double[numPessoas];

        for(int i = 0; i < numPessoas; i++){
            System.out.printf("Dados da %da pessoa", i+1);
            sc.nextLine();
            System.out.print("\nNome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

            mediaAltura += altura[i];

            if(idade[i] < 16){
                porcentagem += 1;
            }
        }

        mediaAltura = mediaAltura/numPessoas;
        porcentagem = (porcentagem/numPessoas) * 100;

        System.out.printf("\nAltura média: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", porcentagem);
        for(int i = 0; i < numPessoas; i++){
            if(idade[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
