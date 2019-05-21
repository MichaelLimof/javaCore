package classes.aula;

public class Professor {

	public String nome;
	public String rg;
	public String matricula;
	public String cpf;
	
	
   		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	 public void imprime(Professor prof) {
			System.out.println(prof.nome);
			System.out.println(prof.cpf);
			System.out.println(prof.matricula);
			System.out.println(prof.rg);
			

		}	
	
}
