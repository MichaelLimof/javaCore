package metodoscomoParametros;

public class MainCalculadora {
	public static void main(String[] args) {
		
		Calculadora calcula= new Calculadora();
		int num1 = 5;
		int num2 = 10;
		
		calcula.alteraDoisNumeros(num1, num2);
		
		System.out.println("dentro do main");
		 System.out.println("int num1 "+ num1);
		 System.out.println("int num2 "+ num2);
		
	}

	}


