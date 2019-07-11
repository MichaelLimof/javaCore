package sobrecargaMetodos.test;

import sobrecargaMetodos.classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		
		
		Funcionario func = new Funcionario();
		//O Java vai procurar o Metodo que melhor se adequa a lista de argumentos que são passados abaixo...
		func.init("joao Feijao", "111.222.333-44", 1200,"12.544.088-0", "chapa");
		
		
		
		Funcionario func2 = new Funcionario();
		func2.init("joao drop", "111.222.333-44", 1200,"12.544.088-0", "Auxiliar");

//		func.setNome("mario Armario");
//		func.setCpf("873.654.345-00");
//		func.setSalario(2000);
//		
		
		func.imprime();
		System.out.println("================");
		func2.imprime();
		
		
	}
	
}
