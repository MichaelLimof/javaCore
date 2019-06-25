package metodos.ibm;

public class Calculadora {

	public void somaDoisNumeros() {
		System.out.println(5 + 15);
		
	}
	
	
	public void divideDoisNumeros() {
		System.out.println(10 / 2);
	}

	public void subtraiNumeros() {
		System.out.println(10 - 5);
		
	}
	 public void divide(float num1, float num2) {
		System.out.println(9 / 2);
	 }
	public void multiDoisN(float num1, float num2) {
		System.out.println(num1 * num2);
	}

	public double divNumeros(double num3, double num4) {
		if (num4 != 0) {
			return num3 / num4;
		}
		return 0;
	}

	public void printNumDivididos(double num3, double num4) {
		if (num4 != 0) {
			System.out.println(num3 / num4);
			return;
		}

		System.out.println("fail");

	}

}
