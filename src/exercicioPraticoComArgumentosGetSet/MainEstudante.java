package exercicioPraticoComArgumentosGetSet;

public class MainEstudante {
	public static void main(String[] args) {

		Estudante estudante = new Estudante();
		estudante.setNome("michael Lima");
		estudante.setIdade(25); 
		estudante.setNotas(new double[] { 6, 6, 6 }); 
		estudante.imprimir();
		estudante.tirarMedia();
		System.out.println(estudante.getNome());
		System.out.println("Aprovado? " + estudante.isAprovado());

	}
}
