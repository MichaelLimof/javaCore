package classes.aula.intro.testes;

import classes.aula.Estudante;

public class EstudanteTest {
	
	public static void main(String[] args) {
		
		Estudante joao = new Estudante();//joao � uma variavel local
		joao.nome = "jo�o";
		joao.matricula = "1234";
		joao.idade = 16;
		
		System.out.println(joao.nome);
		System.out.println(joao.idade);
		System.out.println(joao.matricula);
	}

}
