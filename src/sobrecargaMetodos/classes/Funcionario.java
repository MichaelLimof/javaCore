package sobrecargaMetodos.classes;



public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	
	public void imprime() {
		
		//o This esta dentro do Objeto
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.salario);
		System.out.println(this.rg);
	}
	
	
	/*AULA SOBRECARGA DE METODOS --> QUANDO É UTILIZADO O MESMO NOME DE UM METODO EXISTENTE, PORÉM OS PARAMETROS
	 PRECISAM OBRIGATORIAMENTE SER DIFERENTES  , SEGUE ABAIXO.....                                       */
	
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;

	}

	public void init(String nome, String cpf, double salario, String rg) {
		init(nome,cpf,salario);
//		this.nome = nome;
//		this.cpf = cpf;
//		this.salario = salario;
		this.rg = rg;
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	} 
	 

}
