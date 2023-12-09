package PracticasBuclesU5A;

public class SumarPareseImpares100y200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumaPares=0;
		int sumaImpares=0;
		
		for ( int numero = 100; numero <=200; numero++) {
			
			if (numero %2 ==0) {
				
				sumaPares += numero;
			} else {
				sumaImpares += numero;
			}
		}
        // Mostramos las sumas de números pares e impares por pantalla
        System.out.println("La suma de los números pares entre 100 y 200 es: " + sumaPares);
        System.out.println("La suma de los números impares entre 100 y 200 es: " + sumaImpares);
    }


	}


