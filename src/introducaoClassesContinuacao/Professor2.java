package introducaoClassesContinuacao;

public class Professor2 {

	public String nome;
	public String rg;
	public String matricula;
	public String cpf;

	public void imprime() {
		System.out.println("=------------------------=");
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.matricula);
		System.out.println(this.rg);

	}

	public void imprime3(Professor2 aux) {
		System.out.println("=------------------------=");
		System.out.println(aux.nome);
		System.out.println(aux.cpf);
		System.out.println(aux.matricula);
		System.out.println(aux.rg);

	}

	public void imprime2() {
		System.out.println("=------------------------=");
		System.out.println(this.cpf);
		System.out.println(this.nome);
		System.out.println(this.rg);
		System.out.println(this.matricula);
	}

}
