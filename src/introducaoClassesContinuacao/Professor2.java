package introducaoClassesContinuacao;

public class Professor2 {

	public String nome;
	public String rg;
	public String matricula;
	public String cpf;

	public void imprime() {  //a palavra THIS quer dizer que vc vai pegar os valores de dentro do objeto
		System.out.println("=---------imprime----------=");
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.matricula);
		System.out.println(this.rg);

	}


	public void imprime2() {
		System.out.println("=--------IM2-----------=");
		System.out.println(this.cpf);
		System.out.println(this.nome);
		System.out.println(this.rg);
		System.out.println(this.matricula);
	}
	
	
	public void imprime3(Professor2 aux) { //variavel de referencia dentro dos ()
		System.out.println("=----------AUX-----------=");
		System.out.println(aux.nome);
		System.out.println(aux.cpf);
		System.out.println(aux.matricula);
		System.out.println(aux.rg);
		
		aux.nome = "juca";
		System.out.println(aux.nome);

	}

}
