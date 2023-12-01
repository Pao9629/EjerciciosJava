package JavaU4;

import java.util.*; 

public class DosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Introduce el primer número");
		
		int numero1= scanner.nextInt();
		
		System.out.print("Introduce el segundo número");
		
		int numero2= scanner.nextInt();
		
		//Aqui se realizan las operaciones que es lo que faltaba
		
		int suma= numero1+numero2;
		int resta= numero1-numero2;
		int producto=numero1*numero2;
		double division=0; // tenemos q inicilizar cero para evitar division
		//por cero
		
		if (numero2 !=0) {
			division=(double) numero1/numero2;
		}
		
		System.out.println("El resultado de la suma es " + suma);
		System.out.println("El resultado de la resta es " + resta);
		System.out.println("El resultado de la multiplicación es " + producto);
		
		if(numero2 !=0) {
			
			System.out.println("El resultado de la división es " + division);
			
		} else {
			
			System.out.println("No es posible dividir por cero.");
			
		}
			
		
		
		
		
		
		
		
	}

}
