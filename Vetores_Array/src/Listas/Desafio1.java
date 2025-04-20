package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Beatriz");
        nomes.add("Antony");
        nomes.add("Carlos");
        nomes.add("Amanda");
        nomes.add("Bianca");
        nomes.add("André");
        nomes.add("Clara");
        nomes.add("Camile");
        nomes.add("Diana");
        nomes.add("Davi");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a letra inicial para filtrar os nomes: ");
        String letra = scanner.nextLine().toUpperCase();
        
        List<String> nomesFiltrados = new ArrayList<>();
        
        for (String nome : nomes) {
            if (nome.toUpperCase().startsWith(letra)) {
                nomesFiltrados.add(nome);
            }
        }
        
        System.out.println("Nomes encontrados que começam com \"" + letra + "\": " + nomesFiltrados);
        System.out.println("Total de nomes: " + nomesFiltrados.size());

        scanner.close();

	}

}
