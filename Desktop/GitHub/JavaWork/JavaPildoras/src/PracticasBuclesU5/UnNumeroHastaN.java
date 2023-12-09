package PracticasBuclesU5;

import java.util.*;

public class UnNumeroHastaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce un número N");
		int n = scanner.nextInt();//Lee el numero n ingresado
		
		int contador = 1;
		
		while (contador <=	n ) {
			System.out.println(contador);
			contador ++;

		}
		
		scanner.close();
	}

}
