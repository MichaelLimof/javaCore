package blocoDeInicializaçãoAula2;

import blocoDeInicializaçãoAula2.Cliente;

public class ClienteMain {
	public static void main(String[] args) {
		
		Cliente cliente1  = new Cliente();
		
		Cliente cliente2  = new Cliente();
		System.out.println("Exibindo a quantidade de clientes : " );
//		for (int parc : Cliente.getParcelas() ){
//			System.out.print(parc + " ");
			
//		}
		
		System.out.println("tamanho " + Cliente.getParcelas().length);
	}
}
