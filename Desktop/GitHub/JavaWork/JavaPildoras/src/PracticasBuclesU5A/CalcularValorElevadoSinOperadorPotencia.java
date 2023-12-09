package PracticasBuclesU5A;

import java.util.*;

public class CalcularValorElevadoSinOperadorPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Ingresa el valor de A: ");
	int A = scanner.nextInt();
	
	System.out.print("Ingresa el valor de B: ");
	
	int B = scanner.nextInt();
	
	int resultado = 1;
	for (int i=0; i < B; i++) {
		resultado *=A;
		
	System.out.println("El resultado de " + A + " elevado a " + B + " es: " + resultado);
	
		}
	}

}
