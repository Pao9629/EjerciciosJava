package ArraysString;

import java.util.*;

public class Cadena1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un programa que demane una cadena de text 
		//per teclat i després mostre cada paraula
		//de la cadena en una línia diferent.
		
		Scanner scanner=new Scanner(System.in);
		//Objeto scanner para entrada de usuario
		// Solicitamos como siempre al usuario ingresar cadena de texto
		
		System.out.print("introduce una cadena de texto: ");
		String cadena = scanner.nextLine();
		
		//Ahora dividimos la cadena en palabras usando split ()
		// y mostramos cada palabra
		
		String[] palabras = cadena.split("\\s+");
		System.out.println("Las palabras de la cadena son: ");
		
		for (String palabra : palabras) {
			System.out.println(palabra);
			
		}
		
		scanner.close();
	}

}
