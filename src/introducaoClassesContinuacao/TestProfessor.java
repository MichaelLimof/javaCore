package introducaoClassesContinuacao;

public class TestProfessor {

	public static void main(String[] args) {

		Professor professor = new Professor();
		professor.setNome("Silva");
		professor.setCpf("234.232.443-88");
		professor.setMatricula("33233");
		professor.setRg("32344099");

		Professor professor2 = new Professor();
		professor2.setNome("dunha");
		professor2.setCpf("443.554.997-09");
		professor2.setMatricula("454555");
		professor2.setRg("5673454354");

		System.out.println(professor.getNome());
		System.out.println(professor.getCpf());
		System.out.println(professor.getMatricula());
		System.out.println(professor.getRg());

		System.out.println("=--------------OUTRO PROFESSOR---------------=");

		System.out.println(professor2.getNome());
		System.out.println(professor2.getCpf());
		System.out.println(professor2.getMatricula());
		System.out.println(professor2.getRg());

		
		
	}
	

}
