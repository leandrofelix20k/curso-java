package exercicios_propostos.s10_arrays_e_listas.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnotacoesListas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criand uma lista:
        List<Integer> numeros = new ArrayList<>();
        List<String> nomes = new ArrayList<>();


        // Adicionando elementos em uma lista
        numeros.add(2);
        numeros.add(4);
        numeros.add(1);
        numeros.add(7);

        // Adicionando elementos em uma posição específica da lista
        numeros.add(1, 34);

        // Tamanho da lista:
        System.out.println("Tamanho da lista: " + numeros.size());

        // for each
        for(Integer x : numeros){
            System.out.println(x);
        }

        nomes.add("João");
        nomes.add("José");
        nomes.add("Ana");
        nomes.add("Maria");

        // Remover elemento da lista pelo índice:
        numeros.remove(1);

        // Remover elemento da lista pelo valor do elemento:
        nomes.remove("Maria");

        // Remover elemento da lista por um predicado:
        nomes.remove("Maria");

        System.out.println("\nValores sem o índice 1: ");
        for(Integer x : numeros){
            System.out.println(x);
        }

        System.out.println("\nMaria removida: ");
        for(String n : nomes){
            System.out.println(n);
        }

        // Remover elemento da lista por um predicado através de uma função lambda
        nomes.removeIf(x -> x.charAt(0) == 'J');

        System.out.println("\nJotas removidos: ");
        for(String n : nomes){
            System.out.println(n);
        }

        nomes.add("Marcos");
        nomes.add("Mario");
        nomes.add("Zé");

        // Buscando a posição de um dado elemento
        System.out.println("\nIndice da Zé: " + nomes.indexOf("Zé"));

        //Buscando a posição de um elemento que não existe na lista:
        System.out.println("\nIndice do Charopinho: " + nomes.indexOf("Charopinho"));
        // -1

        // Filtrar elementos da lista a partir de um predicado:
        List<String> listaFiltrada = nomes.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        System.out.println("\nApenas os Ms:");
        for(String n : listaFiltrada){
            System.out.println(n);
        }

        // Encontrar a primeira ocorrência com base em um predicado:
        String primeiraOcorrencia = nomes.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

        System.out.println("\nPrimeiro Mr M: " + primeiraOcorrencia);

        sc.close();
    }
}
