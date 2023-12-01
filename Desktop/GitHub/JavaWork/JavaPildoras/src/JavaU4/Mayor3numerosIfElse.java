package JavaU4;

import java.util.Scanner;

public class Mayor3numerosIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner (System.in);
		
		System.out.print("Introduce un primer número: ");
		
		int numero1=scanner.nextInt();
		
		System.out.print("Introduce un segundo número: ");
		
		int numero2=scanner.nextInt();
		
		System.out.print("Introduce un tercer número : ");
		
		int numero3=scanner.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
         
			System.out.println("El número más grande es: " + numero1);
        
		} else if (numero2 >= numero1 && numero2 >= numero3) {
          
			
			System.out.println("El número más grande es: " + numero2);
        } else {
            
        	System.out.println("El número más grande es: " + numero3);
        }	
	}

}
