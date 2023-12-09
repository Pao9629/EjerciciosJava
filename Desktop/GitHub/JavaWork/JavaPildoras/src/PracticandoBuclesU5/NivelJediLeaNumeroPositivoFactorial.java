package PracticandoBuclesU5;

import java.util.*;

public class NivelJediLeaNumeroPositivoFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Introduce un número positivo N: ");

		int n = scanner.nextInt();//Lee el numero
		
		long factorial = 1; // inicia como 1
		
		if (n<0) {
			System.out.println("El factorial de un número negativo no está definido ");
		
		} else { 
			//Calcula el factorial
			for (int i = 1; i <=n; i++) {
				
				factorial *= i;
			}
			
			System.out.println("El factorial de " + n + " !es: " + factorial);
			
		}
		
		scanner.close();
	}

}
