package ArraysString;

import java.util.*;

public class Cadenas2Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un objeto Scanner para la entrada de usuario
		
		Scanner scanner = new Scanner (System.in);
		
		// Solicitamos la entrada de texto 
		System.out.print("Introduce una cadena de texto: ");
		String cadena1=scanner.nextLine();
		
		// Ahora la segunda
		
		System.out.print("Introduce la segunda cadena de texto: ");
		String cadena2=scanner.nextLine();
		
		// verificamos si las cadenas son iguales
		
		if (cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguals.");
			
		} else { 
			
			System.out.println("Las cadenas son diferentes.");
			
		}
		
		// Verificar si las cadenas son iguales sin dif entre mayúsculas y minusculas
		
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Las cadenas son iguales (Sin diferenciar entre Mayusculas y minisculas)");
		} else {
			System.out.println("Las cadenas son diferentes (Sin diferenciar entre Mayusculas y minisculas)");
			
		}
		
		scanner.close();
		
		
	}

}
