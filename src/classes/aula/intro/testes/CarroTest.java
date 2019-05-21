package classes.aula.intro.testes;

import classes.aula.Carro;

public class CarroTest {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Lamborguini";
		carro.modelo = "Aventador";
		carro.velocidadeMaxima = 380;
		
		
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		System.out.println(carro.velocidadeMaxima + " KM/h");
		
	}

}
