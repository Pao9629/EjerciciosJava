package ExplicacionesJavaBasics;

import java.util.Scanner;

public class EjercicioCondicionalfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner entrada=new Scanner(System.in);
			
			System.out.println("Introduce tu  edad por favor");
			
			int edad = entrada.nextInt();
			
			// Si quiero por ejemplo imprimir varias condicionales if
			// porque quiero que me imprima diversos resultados dependiendo
			// del numero introducido tengo opcion de escribir varias 
			// hacer un metodo else if
			
			if (edad<18) {
				
				System.out.println("Eres  adolescente");
			}
			
			else if (edad<40) {
			
				System.out.println("Eres joven");
			
			}
			
			else if (edad<65) { // y sino mira a ver ... 
				
				System.out.println("Eres maduro");
			
			}
			
			else {
				
				System.out.println("Cuidate mucho");
			
			}
	}

}
