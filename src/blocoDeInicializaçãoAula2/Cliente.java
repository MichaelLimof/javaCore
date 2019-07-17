package blocoDeInicializaçãoAula2;

public class Cliente {
	// 0 O bloco de Inicialização estatico é executado quando a JVM carregar a classe, executado somente  uma vez cada
	// 1º é alocado espaço na memoria para o Objeto que será criado
	// 2º Cada atributo de classe é criado e inicializado com seus valores default  ou explicitos

	// 3º Bloco de inicialização é executado antes do construtor. Isso é um bloco => {} , segundo as boas praticas, deve ser criado antes do construtor
	// 4º O construtor é executado
	//O bloco de Inicialização nao estatico pode acessar atributos estaticos,porque os atributos já irão existir antes mesmo de haver o bloco de inicialização
	
	//adicionado ''Static''
	private static int[] parcelas ;
	
	
	//bloco de inicialização, se utilizar Static , ele sera executado primeiro, na ordem de declaração e somente uma vez cada
	static{
		parcelas = new int [50];
		System.out.println("dentro do bloco de Inicialização");
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
