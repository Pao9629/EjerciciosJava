package PracticasBuclesU5B;

import java.util.*;

public class Cuadrado5primerosnumerosnaturales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limite = 5; //(numero terminos a sumar)
		
		int sumaCuadrados = 0;
		
		for (int i = 1; i <= limite; i++) {
			sumaCuadrados += i * i; //Calcula el cuadrado de cada número y lo suma a la variable
		}
		
		System.out.println("La suma de los cuadrados de los primeros " + limite + " números naturales es: " + sumaCuadrados);
	}

}
