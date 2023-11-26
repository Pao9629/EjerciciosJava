package ExplicacionesJavaBasics;

import java.util.*;

public class DoWhileExercise {

	public static void main(String[] args) {
		// EVALUA LA CONDICION TRAS HABER EJECUTADO EL CODIGO
		//Asegura que lo que hay dentro del bucle se ejecute 1 vez
	
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		do {
			
			intentos++;
			System.out.println("Introduce un número, por favor");
			
			numero = entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Más bajo");
			}
	
			else if(aleatorio>numero) {
				
				System.out.println("Más alto");
			}
			
		}	while(numero!=aleatorio);
	
			System.out.println("Oleeee. Lo has conseguido en  " + intentos + " intentos");	
			
	}

}
