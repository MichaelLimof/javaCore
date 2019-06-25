package exercicioPratico;

public class MainEstudante {
	public static void main(String[] args) {

		Estudante estudante = new Estudante();
		estudante.nome = "michael Lima";
		estudante.idade = 25;

		estudante.notas = new double[] { 3, 5.7, 4 };

		estudante.imprimir();
		estudante.tirarMedia();

	}
}
