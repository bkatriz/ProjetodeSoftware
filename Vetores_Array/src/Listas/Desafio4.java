package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
        palavras.add("Banana");
        palavras.add("Maçã");
        palavras.add("Abacate");
        palavras.add("Manga");
        palavras.add("Morango");
        palavras.add("Abacaxi");
        palavras.add("Tomate");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra para remover palavras que a contenham: ");
        String letra = scanner.nextLine().toLowerCase(); 


        List<String> palavrasFiltradas = new ArrayList<>();

        for (String palavra : palavras) {
            if (!palavra.toLowerCase().contains(letra)) {
                palavrasFiltradas.add(palavra);
            }
        }
        
        System.out.println("Palavras originais: " + palavras);
        System.out.println("Removendo palavras que contêm a letra que foi escolhida \"" + letra + "\": " + palavrasFiltradas);

        scanner.close();

	}

}
