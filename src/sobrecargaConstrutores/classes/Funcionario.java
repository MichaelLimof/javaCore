package sobrecargaConstrutores.classes;

public class Funcionario {

	
	private String nome;
	private String matricula;
	private String cargo;
	private String funcao;
	private double [] salarios;
	
	private String filial;
	
	public Funcionario(String nome, String matricula, String cargo, String funcao, double [] salarios) {
	this.nome = nome;
	this.matricula = matricula;
	this.cargo = cargo;
	this.funcao = funcao;
	this.salarios = salarios;
	}
	//Regra=> Um construtr só pode chamar outro construtor dentro de contrutores 
	//2ª regra => Na chamada de contrutores, obrigatóriamente deve ser chamando na primeira linha , exemplo linha 24 
	public Funcionario(String nome, String matricula, String cargo, String funcao, double [] salarios, String filial) {
		this(nome, matricula,cargo,funcao,salarios);
		
		this.filial = filial;
		}
	
	public Funcionario() {
		System.out.println("Construtor default");
		
	}
	
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
		System.out.println(this.cargo);
		System.out.println(this.funcao);
		for (double sal : salarios) {
		System.out.print(sal + " ");
		
		}
		System.out.println(this.filial);
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double[] getSalarios() {
		return salarios;
	}
	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
}
