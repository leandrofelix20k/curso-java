package exercicios_propostos.s8_introducao_poo.ex003;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.setNome(sc.nextLine());
        aluno.setNota1(sc.nextDouble());
        aluno.setNota2(sc.nextDouble());
        aluno.setNota3(sc.nextDouble());

        System.out.println(aluno);

        sc.close();
    }
}
