package JavaU4;

import java.util.*;

public class Ascendiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Introduce el primer número : ");
		
		int numero1=scanner.nextInt();
		
		System.out.print("Introduce el segundo número : ");
		
		int numero2=scanner.nextInt();
		
		if (numero1<=numero2) {
			
			System.out.println("Orden ascendente : " + numero1 + " , " + numero2);
			
		}else {
	
			System.out.println("Orden ascendente: " + numero2 + " , " + numero1);
			
		}
		
	}

}
