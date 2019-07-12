package modificadorStaticMetodos;


import modificadorStaticMetodos.Pessoa;

public class PessoaMain {
	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa("Juca Pirassununga", 51,0.08);
				
		Pessoa pessoa2 = new Pessoa("Tati Barreiro", 29, 0.10);
		
		Pessoa pessoa3 = new Pessoa("Caninha", 38, 0.12);
		
		pessoa1.imprime();
		pessoa2.imprime();
		pessoa3.imprime();
		
		
//O Atributo Statico se torna atributo da Classe		
		
//		Pessoa.maximoTeorEtilico = 0.20;
		
		//O Metodo Statico é um atributo da Classe		
		Pessoa.setMaximoTeorEtilico(0.20);
		
		
		pessoa1.imprime();
		pessoa2.imprime();
		pessoa3.imprime();
	}

}
