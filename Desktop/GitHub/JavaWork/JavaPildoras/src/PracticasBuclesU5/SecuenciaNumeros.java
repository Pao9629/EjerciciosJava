package PracticasBuclesU5;

import java.util.*;

public class SecuenciaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	
	int positivos=0;
	int negativos=0;
	
	System.out.println("Introduce 10 números no nulos. Ingresa 0 para finalizar:");

	int numero=1; //Inicializar con valor diferente de 0
		
	while (numero!=0) {
		System.out.println("Ingresa un número: ");
		numero = scanner.nextInt();
				
		if (numero > 0) {
			positivos ++;
		} else if (numero<0) {
			negativos++;
		}
	}
	
	// Restar 1 a positivos si el número ingresado para salir (0) es contado como positivo
		if (positivos < 0) {
			positivos --;
		}
		
		 System.out.println("Cantidad de números positivos (excluyendo 0): " + positivos);
	     System.out.println("Cantidad de números negativos: " + negativos);
	
	     
	    scanner.close();
	}

}
