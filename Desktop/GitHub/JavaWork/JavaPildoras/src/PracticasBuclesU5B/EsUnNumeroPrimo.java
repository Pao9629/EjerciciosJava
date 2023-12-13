package PracticasBuclesU5B;

import java.util.*;
public class EsUnNumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un número positivo para verificar si es positivo o no: ");
		
		int numero = scanner.nextInt();
		
		boolean esPrimo = esNumeroPrimo(numero);
		
		if (esPrimo) {
			System.out.println(numero + " es un número primo.");
			
		} else {
			System.out.println(numero + " no es un número primo");
		}
		
		scanner.close();
		
	}

	//metodo verificar numero primo
	
	public static boolean esNumeroPrimo(int numero) {
		if (numero <=1 ) {
			return false;			
		}
		
		for (int i=2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				// Si es divisible por algún número 
				//diferente de 1 y sí mismo, 
				//no es primo
				return false;
			}
				
			}
		
			return true;
	}
}
	


