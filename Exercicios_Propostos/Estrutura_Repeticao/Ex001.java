package Exercicios_Propostos.Estrutura_Repeticao;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String senha;

		while(true) {
			senha = sc.next();

			if(senha.intern() == "2002") {
				System.out.println("Acesso Permitido");
				break;
			}

			System.out.println("Senha Invalida");
		}

		sc.close();
	}
}
