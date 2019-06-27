package exercicioPraticoComArgumentosGetSet;

import java.text.DecimalFormat;

public class Estudante {

	private String nome;
	private int idade;
	private double[] notas; // Array � um objeto tipo Reference , seu valor � Nulo
	private boolean aprovado; //O Encapsulamento do Bool torna Se IS ao inves de GET, exclui o SET para nao ser modificado

	public void imprimir() {
		System.out.println(" O nome � " + this.nome);
		System.out.println(" A idade  � " + this.idade);

		if (notas != null) {                      // esse tratamento se d� devido ao NE que acontece quando o array n�o foi
								                  // declarado
			for (double nota : notas) {                // Esse for aqui teve que ser usado porque o Array quando � impresso diretamente
										               // , ele esta se referindo
				System.out.println(nota + " ");              // ao Array double, portante um Array sempre ser� um Objeto
			}
		}
	}

	public void tirarMedia() {

		double media = 0;
		DecimalFormat formatador = new DecimalFormat("0.00");

		if (notas == null) { // esse tratamento se d� devido ao NE que acontece quando o array n�o foi
								// declarado
			System.out.println("O Aluno n�o possui Notas! (Array vazio)");
			return;
		}
		for (double nota : notas) {
			media += nota;

		}
		media = media / notas.length;

		if (media >= 6) {
			this.aprovado=true;
			System.out.println("Aluno Aprovado . Nota: " + formatador.format(media));

		} else {
			this.aprovado=false;
			System.out.println("Reprovado! Nota: " + formatador.format(media));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public boolean isAprovado() {
		return aprovado;
	}



}
