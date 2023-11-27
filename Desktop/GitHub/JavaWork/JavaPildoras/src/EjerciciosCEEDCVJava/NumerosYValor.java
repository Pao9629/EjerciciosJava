package EjerciciosCEEDCVJava;

import java.util.*;

public class NumerosYValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		//Pedimos al usuario que introduzca el primer numero
		System.out.println("Introduce el primer por fa número");
		double numero1=scanner.nextDouble();
		
		
		//Pedimos al usuario que introduzca el segundo numero
		System.out.println("Introduce el segundo numero");
		double numero2=scanner.nextDouble();
		
		double suma = numero1+numero2;
		double resta= numero1-numero2;
		double producto= numero1*numero2;
		double division=(numero1/numero2);
		
		//Mostrar los resultados
		
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Producto: " + producto);
		System.out.println("Division: " + division);
		
		//Cerramos el scanner
		
		scanner.close();
		

	}

}
