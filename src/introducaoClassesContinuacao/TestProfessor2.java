package introducaoClassesContinuacao;

public class TestProfessor2 {
	
	public static void main(String[] args) {
	
		Professor2 prof = new Professor2();
		prof.cpf = "112.323.869.09";
		prof.nome = "teste";
		prof.matricula = "mat 33434";
		prof.rg = "12122";
		
		Professor2 prof2 = new Professor2();
		prof2.cpf = "342.344.778-55";
		prof2.nome = "segundo";
		prof2.matricula = "qz 6666";
		prof2.rg = "121767722";
		
		
		prof2.imprime();
		prof.imprime();
		System.out.println("dentro do prof teste");
		System.out.println(prof.nome);
		prof.imprime3(prof);
		//A variavel aux com o nome Mariana foi alterada na classe , na linha abaixo tambem esta printando a variavel aux. Tudo por conta 
		//da alteracao do metodo feito na classe Professor2  impactou na classe professor Teste.
		//Ou seja quando se coloca aux.nome= ...... voce está alterando o endereço de memoria
		System.out.println(prof.nome);

//		prof.imprime3(prof2);
	
	
	}
	

}
