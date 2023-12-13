package PracticasBuclesU5B;

import java.util.*;

public class MayorQueElUltimoDatoIntroducido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int totalNumeros=0;
		int totalNumerosFallados=0;
		
		System.out.print("Introduce un número inicial: " );
		
		int ultimoNumero= scanner.nextInt(); //iNICIALIZAMOS con un valor maximo para comparar con los numeros ingresados
		
		while (true) {
			System.out.print("Introduce un numero (introduce 0 para terminar): ");
			int numero = scanner.nextInt();
			
			if (numero == 0) {
				
				break; //Si se ingresa 0, sale del bucle
			}
	
			if (numero > ultimoNumero ) {
				totalNumeros++;
				ultimoNumero = numero;
			} else {
				totalNumerosFallados++;
				System.out.println("El número ingresado no es mayor que el anterior. Introduce otro numero.");
			}
		}
		 System.out.println("El total de números introducidos, excluyendo el 0, es: " + totalNumeros);
	     System.out.println("El total de números fallados es: " + totalNumerosFallados);
		
	     scanner.close();
		
	}

}
