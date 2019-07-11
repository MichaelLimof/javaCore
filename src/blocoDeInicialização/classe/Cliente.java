package blocoDeInicializa��o.classe;

public class Cliente {

	// 1� � alocado espa�o na memoria para o Objeto que ser� criado
	// 2� Cada atributo de classe � criado e inicializado com seus valores default
	// ou explicitos
	// 3� Bloco de inicializa��o � executado antes do construtor. Isso � um bloco => {} , segundo as boas praticas, deve ser criado antes do construtor
	// 4� O construtor � executado

	private int[] parcelas ;

	{
		parcelas = new int [50];
		System.out.println("dentro do bloco de Inicializa��o");
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
