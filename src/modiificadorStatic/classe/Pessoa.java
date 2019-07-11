package modiificadorStatic.classe;

//Existe a Lei seca que estabelece um Limite de 0.04 miligramas teor alcoolico por litro de ar

//Quando é criado um Atributo Statico , o mesmo não pertence a um objeto(exemplo: PessoaX) e sim a classe Pessoa
//Se o Atributo Statico for Setado em um Objeto, todos os demais tambem serão afetados, pois Static se torna atributo da Classe		
public class Pessoa {

	private String nome;
	private int idade;
	private double minimoTeorEtilico;
	public static double maximoTeorEtilico = 0.04;

	public Pessoa() {

	}

	public Pessoa(String nome, int idade, double minimoTeorEtilico) {
		this.nome = nome;
		this.idade = idade;
		this.minimoTeorEtilico = minimoTeorEtilico;
		
	}
	
	
	public void imprime() {
		System.out.println("=-------------------=");
		System.out.println("Nome : "+this.nome);
		System.out.println("Idade dx cabra : "+this.idade);
		System.out.println("O quanto encheu a cara : "+this.minimoTeorEtilico + " miligramas");
		System.out.println("Limite de Alcool : "+ maximoTeorEtilico + " miligramas");   //não usa-se o this em atributo statico
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

	public double getMinimoTeorEtilico() {
		return minimoTeorEtilico;
	}

	public void setMinimoTeorEtilico(double minimoTeorEtilico) {
		this.minimoTeorEtilico = minimoTeorEtilico;
	}

	

}
