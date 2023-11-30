package EjerciciosCEEDCVJava;

import java.util.*;

public class PideEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
	
		System.out.print("Introduce tu edad : ");
	
		int edad= scanner.nextInt();
	
		if (edad>=18) {
		
			System.out.println("Eres mayor de edad " + "tienes " + edad + " años");
		
		}

	}
}
