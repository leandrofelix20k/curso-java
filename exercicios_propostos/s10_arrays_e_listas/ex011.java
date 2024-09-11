package exercicios_propostos.s10_arrays_e_listas;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double[] alturas = new double[n];
        String[] genero = new String[n];
        double maiorAltura=0, menorAltura=0, mediaAlturaMulheres=0;
        int quantidadeHomens=0, contMulheres=0;

        for(int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa(M/F): ", i+1);
            sc.nextLine();
            genero[i] = sc.nextLine().toUpperCase();

            if(i == 0){
                maiorAltura = alturas[i];
                menorAltura = alturas[i];
            } else{
                if(alturas[i] > maiorAltura){
                    maiorAltura = alturas[i];
                }
                if(alturas[i] < menorAltura){
                    menorAltura = alturas[i];
                }
            }

            if(Objects.equals(genero[i], "F")) {
                mediaAlturaMulheres += alturas[i];
                contMulheres++;
            }else if(Objects.equals(genero[i], "M")){
                quantidadeHomens++;
            }
        }
        mediaAlturaMulheres = mediaAlturaMulheres/contMulheres;

        System.out.printf("Menor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);
        System.out.printf("\nMedia das alturas das mulhejres = %.2f", mediaAlturaMulheres);
        System.out.println("\nNumero de homens = " + quantidadeHomens);

        sc.close();
    }
}
