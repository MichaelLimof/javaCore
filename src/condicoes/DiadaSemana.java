package condicoes;

import java.util.Scanner;

//Receba um Inteiro via Input e imprima o dia da semana referente comecando com segunda-feira = 1

public class DiadaSemana {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um Numero inteiro");
		 int numeroInput = scan.nextInt();
		 
		 if (numeroInput == 1 ) {
			 System.out.println("É segunda-Feira!");
		 }else if(numeroInput == 2) {
			 System.out.println("É terça-Feira!");
		 }else if(numeroInput == 3) {
			 System.out.println("É Qurta-Feira!");
		 }else if(numeroInput == 4) {
			 System.out.println("É Quinta-Feira!");
		 }else if(numeroInput == 5) {
			 System.out.println("É Sexta-Feira!");
		 }else if(numeroInput == 6) {
			 System.out.println("É Sabado!");
		 }else if(numeroInput == 7) {
			 System.out.println("É Domingo!");
		 }else {
			 System.out.println("Numero Invalido");
		 }
		 
		 
		
	}
}
