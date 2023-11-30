package EjerciciosCEEDCVJava;

import java.util.Scanner;

public class IntroducirEdadElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Introduce tu edad : ");
	
		int edad= scanner.nextInt();
	
		if (edad<=18) {
		
			System.out.println("Eres menor de edad " + "tienes " + edad + " años");
		
		} else {
			
			System.out.println("Eres mayor de edad " + "tienes " + edad + " años");
		}

	}


}


