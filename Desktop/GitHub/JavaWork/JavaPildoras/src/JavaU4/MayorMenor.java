package JavaU4;

import java.util.*;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Introduce el primer numero");
		
		int numero1= scanner.nextInt();
		
		System.out.print("Introduce el segundo numero");
		
		int numero2= scanner.nextInt();
		
		//Operaciones
		
		if (numero1 <= numero2) {
			
			System.out.println(numero1 + " es menor que " + numero2);
			
		} else {
			
			System.out.println(numero1 + " es mayor que " + numero2);
		}
		
		
	}

}
