package exercicios_propostos.s13_heranca_e_polimorfismo.ex02;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of products: ");
        int numProdutos = sc.nextInt();
        sc.nextLine();

        List<Product> produtos = new ArrayList<>();

        for(int i=0; i<numProdutos; i++) {
            System.out.println("Product #" + (i + 1) + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char tipo = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Price: ");
            double preco = sc.nextDouble();

            if(tipo == 'c') {
                produtos.add(new Product(nome, preco));
            } else if (tipo == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dataStr = sc.next();
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                
                Date manufactureDate = null;
                try {
                    manufactureDate = sdf.parse(dataStr);
                } catch (java.text.ParseException e) {
                    System.out.println("Invalid date format. Please use DD/MM/YYYY.");
                    i--;
                    continue;
                }
                
                produtos.add(new UsedProduct(nome, preco, manufactureDate));

            } else if(tipo == 'i') {
                System.out.print("Customs fee: ");
                double taxa = sc.nextDouble();
                produtos.add(new ImportedProduct(nome, preco, taxa));
            } else {
                System.out.println("Invalid product type.");
            }
        }
        
        System.out.println("\nPRICE TAGS:");
        for(int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
        
        sc.close();
    }
}
