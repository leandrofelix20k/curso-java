package exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class Testes {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product produto = new Product();

        System.out.println(produto);
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        produto.setNome(sc.next());
        System.out.print("Price: ");
        produto.setPreco(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        produto.setQuantidade(sc.nextInt());

        System.out.printf("\nProduct data: %s, $ %.2f, Total: $ %.2f\n", produto.getNome(), produto.getPreco(), produto.totalValueStock());
        System.out.print("\nEnter the number of product to be added in stock: ");
        produto.addProducts(sc.nextInt());

        System.out.printf("\nUpdated data: %s, $ %.2f, Total: $ %.2f\n", produto.getNome(), produto.getPreco(), produto.totalValueStock());

        System.out.print("\nEnter the number of product to be remover from stock: ");
        produto.removeProducts(sc.nextInt());

        System.out.printf("\nUpdated data: %s, $ %.2f, Total: $ %.2f\n", produto.getNome(), produto.getPreco(), produto.totalValueStock());

        sc.close();
    }
}
