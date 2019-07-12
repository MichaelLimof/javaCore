package modificadorStaticMetodos;

//Exercicio: Existe a Lei seca que estabelece um Limite de 0.04 miligramas teor alcoolico por litro de ar

//Regras para metodos Estaticos. Somente pode se criar um metodo estatico quando o metodo nao esta utilizando atributos da classe
//Nao se pode acessar atributos nao estaticos (this.variavel) com metodos estaticos
public class Pessoa {

	private String nome;
	private int idade;
	private double minimoTeorEtilico;
	private static double maximoTeorEtilico = 0.04;
	
	
	public Pessoa() {

	}
	//Se o metodo nao esta acessando nenhum atributo da Classe, pode ser criado como static, exemplo: variaveis como parametro
	//para usar metodos Estaticos criou-se os Get e Set  e no lugar do This utilizamos a Classe, porque é statico nao associado ao Objeto.
	public static void setMaximoTeorEtilico(double maximoTeorEtilico) {
		Pessoa.maximoTeorEtilico = maximoTeorEtilico;
	}

	public static double getMaximoTeorEtilico() {
		return maximoTeorEtilico;
	}


	public Pessoa(String nome, int idade, double minimoTeorEtilico) {
		this.nome = nome;
		this.idade = idade;
		this.minimoTeorEtilico = minimoTeorEtilico;
		
	}
	
	
	public void imprime() {
		System.out.println("=-------------------=");
		System.out.println("Nome : " + this.nome);
		System.out.println("Idade dx cabra : " + this.idade);
		System.out.println("O quanto encheu a cara : " + this.minimoTeorEtilico + " miligramas");
		System.out.println("Limite de Alcool : " + maximoTeorEtilico + " miligramas");   //não usa-se o this em atributo statico
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
