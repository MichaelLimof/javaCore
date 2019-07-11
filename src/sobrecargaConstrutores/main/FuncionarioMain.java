package sobrecargaConstrutores.main;

import sobrecargaConstrutores.classes.Funcionario;

public class FuncionarioMain {
	public static void main(String[] args) {
		
		
		Funcionario funcionario1  = new Funcionario("joão", "1123345","Tecnico", "Mecanico", new double []{1000,1222,3000,2300}, "Campinas");
		
		
		funcionario1.imprime();
	}

}
