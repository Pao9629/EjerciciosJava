package PracticasBuclesU5B;

import java.util.*;

public class EscribirCaracterLeerNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un numero : ");
		
		int numero = scanner.nextInt();
		
		if (numero > 0) {
			for (int i = 0; i < numero; i++) {
				System.out.print("*");
			}
			
			System.out.println(); // salto de linea
			
		} else {
			
			System.out.println("*");
		}
		
		scanner.close();
		
	}

}
