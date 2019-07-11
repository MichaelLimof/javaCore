package blocoDeInicialização.main;

import blocoDeInicialização.classe.Cliente;

public class ClienteMain {
	public static void main(String[] args) {
		
		Cliente cliente1  = new Cliente();
		
		System.out.println("Exibindo a quantidade de clientes : " );
		for (int parc : cliente1.getParcelas() ){
			System.out.print(parc + " ");
			
		}
	}
}
