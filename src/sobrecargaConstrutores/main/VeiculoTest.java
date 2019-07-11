package sobrecargaConstrutores.main;

import sobrecargaConstrutores.classes.Veiculo;

public class VeiculoTest {
	public static void main(String[] args) {
		
		


		
		Veiculo trator = new Veiculo("cherokee","catterpillar", "EST002390",2011,"não possui");
//		trator.init("catterpillar", "KVM0311", "EST002390",2011,"não possui");
		
		Veiculo carro = new Veiculo();
		
		
		trator.imprimir();
		System.out.println("=============");
		carro.imprimir();
		
	}

}
