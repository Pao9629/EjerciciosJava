package ExplicacionesJavaBasics;

public class Matrices_Ejemplos {

	public static void main(String[] args) {
		// Haremos la matriz con bucle for each

		String [] paises=new String [8];
		
	paises [0]="Brasil";
	paises [1]="Mexico";
	paises [2]="Peru";
	paises [3]="Tocota";
	paises [4]="Chile";
	paises [5]="Argentina";
	paises [6]="Brasilia";
	paises [7]="Brusia";

		/*for(int i=0; i<paises.length;i++) {
			
			System.out.println("País " + (i+ 1 )+ " "  + "es " + paises[i]);*/
			
		for (String elementos:paises) {
			
			System.out.println("Pais: " + elementos);
	
		}
		
			
	}

}
