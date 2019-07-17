package blocoDeInicializa��oAula2;

public class Cliente {
	// 0 O bloco de Inicializa��o estatico � executado quando a JVM carregar a classe, executado somente  uma vez cada
	// 1� � alocado espa�o na memoria para o Objeto que ser� criado
	// 2� Cada atributo de classe � criado e inicializado com seus valores default  ou explicitos

	// 3� Bloco de inicializa��o � executado antes do construtor. Isso � um bloco => {} , segundo as boas praticas, deve ser criado antes do construtor
	// 4� O construtor � executado
	//O bloco de Inicializa��o nao estatico pode acessar atributos estaticos,porque os atributos j� ir�o existir antes mesmo de haver o bloco de inicializa��o
	
	//adicionado ''Static''
	private static int[] parcelas ;
	
	
	//bloco de inicializa��o, se utilizar Static , ele sera executado primeiro, na ordem de declara��o e somente uma vez cada
	static{
		parcelas = new int [50];
		System.out.println("dentro do bloco de Inicializa��o");
		for (int i= 1; i <= 50;i++) {
			parcelas[i-1] = i;
		}
	}

	
//construtor default
	public Cliente() { 

	}
//adicionado ''Static''
	public static int[] getParcelas() {
		return parcelas;
	}



}
