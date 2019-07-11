package sobrecargaMetodos.classes;

public class Veiculo {

	private String marca;
	private String modelo;
	private String chassi;
	private int ano;
	private String infracoes;
	
	
	
	 //Este é um construtor criado manualmente, porem mesmo não declarado ele é criado pelo Java 
    //O mesmo é util , pois podemos definir regras nele, como por exemplo , obrigar que o Veiculo tenha ao menos o modelo
	
	
	public Veiculo (String marca,String modelo,String chassi,int ano, String infracoes) {                            
		this.marca = marca;
		this.modelo = modelo;
		this.chassi = chassi;
		this.ano = ano;
		this.infracoes = infracoes;
	}
	
	
	public Veiculo (String modelo) {                            
		this.modelo = modelo;
	}
	
	
	public void imprimir() {
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.chassi);
		System.out.println(this.ano);
		System.out.println(this.infracoes);		
		
	}
	public void init(String marca,String modelo,String chassi) {
		this.marca= marca;
		this.modelo = modelo;
		this.chassi = chassi;
	}
	public void init(String marca,String modelo,String chassi,int ano, String infracoes) {
		init(marca,modelo,chassi);
		this.ano = ano;
		this.infracoes = infracoes;
		
	}
	
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public String isInfracoes() {
		return infracoes;
	}
	public void setInfracoes(String infracoes) {
		this.infracoes = infracoes;
	}


	
}
