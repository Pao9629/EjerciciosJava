package PracticasBuclesU5A;

public class Calculeysumeproducto10numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		int producto =1;
		
		for( int i = 1; i<=10;i++) {
			suma += i;
			producto *= i;
			
		}
		
		 System.out.println("La suma de los 10 primeros números naturales es: " + suma);
	     
		 System.out.println("El producto de los 10 primeros números naturales es: " + producto);
	}

}
