package JavaU4;

import java.util.*;


public class NegativoOPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Introduce un número : ");
		
		int numero1=scanner.nextInt();
		
		if (numero1<0) {
		
			System.out.println("El número " +  numero1 + " es un numero negativo");
	
		}else {
			
			System.out.println("El número " + numero1 + " es un numero positivo");
	
		}
	}

}
