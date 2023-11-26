package EjerciciosJava;

import java.util.*;

public class EstructurasCondicionalesyBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad = entrada.nextInt();
		
		if (edad>=18) {
			System.out.print("Eres mayor de edad");
		// Aquí esta detenido el programa pero ya hemos empezado con la primera
		//	condición, para completar ahora toca poner else
		// if sería como "si" y else sería como " y si no es verdad"
			//podemos tener if sin else , pero NO else sin if
		
		}
		//podemos ponerlo a continuación o debajo 
		
		else {
			
			System.out.println("Eres menor de edad, sorry");
			
		} //cierre del else
		
		
	} // llave metodo main

} //llave cierre de la clase
