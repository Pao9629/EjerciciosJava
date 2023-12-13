package PracticasBuclesU5B;

import java.util.*;

public class ContarMultiplesde3Desde1HastaNumTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
				
		System.out.print("Introduce un número entero : ");	
		int numero = scanner.nextInt();
		
		System.out.println("Los múltiplos de 3 desde 1 hasta " + numero + " son: ");
		
		for (int i = 1; i <= numero; i++) {
			if (i % 3==0) {  // Verificar si el número actual (i) es un múltiplo de 3
				
				System.out.print(i + "  ") ;// Si i es divisible por 3 (es un múltiplo de 3), se imprime en la consola

		}
	}
		
		scanner.close();
}
}
