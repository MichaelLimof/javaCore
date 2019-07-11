package blocoDeInicialização.classe;

public class Cliente {

	// 1º é alocado espaço na memoria para o Objeto que será criado
	// 2º Cada atributo de classe é criado e inicializado com seus valores default
	// ou explicitos
	// 3º Bloco de inicialização é executado antes do construtor. Isso é um bloco => {} , segundo as boas praticas, deve ser criado antes do construtor
	// 4º O construtor é executado

	private int[] parcelas ;

	{
		parcelas = new int [50];
		System.out.println("dentro do bloco de Inicialização");
		for (int i= 1; i <= 50;i++) {
			parcelas[i-1] = i;
		}
	}
	
	
//construtor default
	public Cliente() { 

	}

	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}

}
