package exercicios_propostos.s8_introducao_poo.ex001;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        retangulo.setLargura(sc.nextDouble());
        retangulo.setAltura(sc.nextDouble());

        System.out.println(retangulo);

        sc.close();
    }
}
