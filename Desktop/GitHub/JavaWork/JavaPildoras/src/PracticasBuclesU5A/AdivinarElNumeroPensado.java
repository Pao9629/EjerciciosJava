package PracticasBuclesU5A;

import java.util.Scanner;

public class AdivinarElNumeroPensado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroPensado =(int) (Math.random() * 100)+1;

		Scanner scanner = new Scanner (System.in);
		
		String respuesta;
		
		do {
			System.out.println("¿Es " + numeroPensado + "  el numero que has pensado? (mayor, menor/igual: ");
			
			respuesta = scanner.nextLine();
			
			if (respuesta.equalsIgnoreCase("mayor")) {
				numeroPensado =(int) (Math.random() * (100 - numeroPensado)) + numeroPensado + 1;
			
			 } else if (respuesta.equalsIgnoreCase("menor")) {
			        numeroPensado = (int) (Math.random() * numeroPensado);
			    }
			} while (!respuesta.equalsIgnoreCase("igual"));

			System.out.println("¡El maravilloso pc ha adivinado tu número!");
			
			
			}
		
	}


