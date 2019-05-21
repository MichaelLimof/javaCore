package metodos.ibm;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();//calculadora é a variavel de instancia

		calculadora.somaDoisNumeros();
		System.out.println("Continuando .....");
		
		calculadora.subtraiNumeros();
		System.out.println("Continuando .....");
		
		calculadora.multiDoisN(23,6);
		
		System.out.println(calculadora.divNumeros(40, 10));
		
		calculadora.divideDoisNumeros();
		System.out.println("Continuando .....fim");
		
		calculadora.printNumDivididos(20, 6);
		
		
		}
		
	}
	

