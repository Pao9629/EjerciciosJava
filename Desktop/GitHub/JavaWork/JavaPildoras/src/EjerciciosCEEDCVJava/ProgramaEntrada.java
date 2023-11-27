package EjerciciosCEEDCVJava;

import java.util.Scanner;

public class ProgramaEntrada {

	public static void main(String[] args) {
		
		// Creamos un objeto Scanner para leer
		// la entrada del usuario
		Scanner scanner=new Scanner(System.in);
	
		/* Pedimos al usuario que introduzca la longitud del lado */
		
		System.out.println("Introduce la lngitud del lado del cuadrado");
	
		/* 	Leer la entrada del usuario como un numero decimal */
		
		double lado = scanner.nextDouble();
	
		//Calcula usando la formula de lado por lado
		
		double area = lado*lado;
		
		// Mostramos el area del cuadrado
		
		System.out.println("El área del cuadrado con lado " + lado + " es " + area);
	
		// cerramos scanner para liberar recursos
		
		scanner.close();
	
	}

}
