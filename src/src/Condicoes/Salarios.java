package src.Condicoes;

public class Salarios {
	public static void main(String[] args) {
		float salario  = 3500.20F;
		
		if (salario < 4000){
			float total = salario * 0.3f;
			System.out.println("30% salario = " + total);
			
			
		}else {
			float total10 = salario * 0.1f;
			System.out.println("10% salario = " + total10);
			
		
		}
	}

}
