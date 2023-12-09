package PracticasBuclesU5;

import java.util.*;

public class PositivosYNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int positivos=0;
		
		int negativos=0;
		
		System.out.println("Introduce 10 numeros no nulos: ");
		
		for (int i=0; i < 10;i++) {
			System.out.print("Número " + (i+1) + ": ");
			int numero = scanner.nextInt();
			
			if (numero > 0) {
				positivos++;
			} else if (numero < 0) {
				negativos++;
			}
		}
		
		System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
		
        scanner.close();
	}

}
