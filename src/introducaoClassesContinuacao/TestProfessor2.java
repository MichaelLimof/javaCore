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
	

		prof.imprime3(prof2);
	
	
	}
	

}
