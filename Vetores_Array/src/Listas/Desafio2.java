package Listas;

import java.util.ArrayList;
import java.util.List;

public class Desafio2 {

	public static void main(String[] args) {
		 List<Integer> numeros = new ArrayList<>();
	        numeros.add(10);
	        numeros.add(20);
	        numeros.add(30);
	        numeros.add(40);
	        numeros.add(100);
	        numeros.add(65);
	        numeros.add(75);

	        
	        int soma = 0;
	        
	        for (int numero : numeros) {
	            soma += numero;
	        }

	        double media = (double) soma / numeros.size();

	       
	        System.out.println("Lista de números: " + numeros);
	        System.out.println("Soma: " + soma);
	        System.out.println("Média: " + media);

	}

}
