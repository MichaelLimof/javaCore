package sobrecargaMetodos.test;

import sobrecargaMetodos.classes.Veiculo;

public class VeiculoTest {
	public static void main(String[] args) {
		
		
//		Veiculo carro = new Veiculo();
//		carro.init("dodge", "dakota", "AGP023098584",2013,"sim");
		
		Veiculo trator = new Veiculo("cherokee");
//		trator.init("catterpillar", "KVM0311", "EST002390",2011,"não possui");
	
		
//		carro.imprimir();
		System.out.println("=============");
		trator.imprimir();
	}

}
