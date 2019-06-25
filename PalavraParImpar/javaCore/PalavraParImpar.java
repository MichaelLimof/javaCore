package javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PalavraParImpar {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra  = scan.nextLine();
		int contador = 0;
		
		List<String> lista = new ArrayList<>();
		
		lista.addAll(Arrays.asList(palavra.split("")));
		
		for(String i : lista) {
			contador++;
			
		}if (contador % 2 == 0) {
			System.out.println("Palavra é Par!");
		}else
			System.out.println("Palavra é Impar!");
		scan.close();
	}
		
}
