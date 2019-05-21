package aula_Array;

import java.util.Scanner;

public class aulaArray {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		int numAlunos = 0;
		double [] notaAlunos = new double [numAlunos];
		
		for(int i=0;i<numAlunos;++i) {
			System.out.print("Insira a nota do aluno:" +(i+1));
			notaAlunos[i] = input.nextDouble();
			input.close();
		}
		for(int i=0;i<numAlunos;++i) {
			System.out.print("nota do aluno" +notaAlunos[i]);
		}

	}

}
