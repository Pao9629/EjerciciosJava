package PracticasBuclesU5B;
/* inserrt comment
*
*/ 


import java.util.*;

public class TeoriaCollatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Ingresa un número entero positivo mayor que uno 1: ");
	int numero = scanner.nextInt();
	
	if (numero <= 1) {
		System.out.println("El numero ingresado no es válido. Debe ser mayor que 1");
		
	} else {
		System.out.println("La secuencia de Collatz para " + numero + " es: ");
	
		while (numero != 1) {
			System.out.print(numero + " ");
			if (numero % 2 == 00) {
				numero /= 2;
			} else {
				numero = numero * 3+1;
			} else {
    (numero !<=1);
     System.out.println("Error") ;
		}
		
		System.out.println(numero); // imprime el último numero el 1

	}
	scanner.close();
	}

}
