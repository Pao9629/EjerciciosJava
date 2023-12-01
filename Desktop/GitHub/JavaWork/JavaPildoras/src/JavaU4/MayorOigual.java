package JavaU4;

import java.util.*;

public class MayorOigual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
		
		System.out.print("Introduce un número ");
		
		int numero1=scanner.nextInt();
		
		System.out.print("Introduce un número ");
		
		int numero2=scanner.nextInt();
		
		if (numero1<numero2) {
			
			System.out.print(numero1 + " es menor que " + numero2);
		
		} else if (numero1>numero2) {
	
			System.out.print(numero1 + " es mayor que  " + numero2);
			
			
		} else {
			
			System.out.print("Los números son iguales: " + numero1 + " y " + numero2);
	
		}	
			
	}

}
