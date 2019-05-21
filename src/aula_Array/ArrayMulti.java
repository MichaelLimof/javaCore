package aula_Array;

public class ArrayMulti {

	public static void main(String[] args) {
		
	
	int [][] numArray = new int [2][2];
	
	
	numArray[0][0] = 30;
	numArray[0][1] = 10;
	numArray[1][0] = 20;
	numArray[1][1] = 40;
	
for(int i=0;i<numArray.length;i++) {
	for(int j=0;j<numArray[i].length;j++) {
		System.out.println(numArray[i][j]);
	}
}System.out.println("=========================");

	for(int[] percorre : numArray) {
		for(int percorridoFinal : percorre ) {
			System.out.println(percorridoFinal);
		}
	}
}
}