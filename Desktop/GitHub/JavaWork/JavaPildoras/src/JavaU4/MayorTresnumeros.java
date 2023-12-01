package JavaU4;

import java.util.Scanner;

public class MayorTresnumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
		
		System.out.print("Introduce un primer número: ");
		
		int numero1=scanner.nextInt();
		
		System.out.print("Introduce un segundo número: ");
		
		int numero2=scanner.nextInt();
		
		System.out.print("Introduce un tercer número : ");
		
		int numero3=scanner.nextInt();
		
		int mayor=numero1;
		
		if (numero2>mayor) {
		
			mayor=numero2; /// Si el segundo número es mayor,
			//actualizamos el valor de mayor

			// Comparamos el tercer número con el actual mayor
		
		if (numero3>mayor) {
			
			mayor=numero3;//Si el tercer número es mayor, 
			//actualizamos el valor de mayor
		}
			
		System.out.println("El número más grande es: " + mayor);
		
		
		
		}	
	}

}
