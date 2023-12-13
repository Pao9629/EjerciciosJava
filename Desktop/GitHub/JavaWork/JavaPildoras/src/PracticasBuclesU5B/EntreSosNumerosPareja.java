package PracticasBuclesU5B;

import java.util.*;

public class EntreSosNumerosPareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Introduce el numero A: ");
		int A = scanner.nextInt();
		
		System.out.print("Introduce el numero B (mayor que A): ");
		int B = scanner.nextInt();
		
		if (B<=A) {
			System.out.println("El numero B debe ser mayor que A, reinicia el programa");
				
		} else {
			int numerosPares = 0;
			
			System.out.println("Los números desde  " + A + " hasta " + B + " son :");
			
			for (int i = A; i <= B; i++) {
				System.out.print(i + " ");
				
				if (i % 2 == 0) {
					numerosPares++;
				}
			}
			
			System.out.println("\nCantidad de números pares en el rango:  " + numerosPares); 
			
		}
		
		scanner.close();		
	}

}
