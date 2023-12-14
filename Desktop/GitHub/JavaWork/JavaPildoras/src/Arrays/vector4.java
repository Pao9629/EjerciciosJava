package Arrays;

import java.util.*;

public class vector4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Crear un array para almacenar los números enteros
        int[] numerosEnteros = new int[20];

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar veinte números enteros
        System.out.println("Ingrese veinte números enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosEnteros[i] = scanner.nextInt();
        }

        // Calcular la suma de valores positivos y negativos
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        for (int numero : numerosEnteros) {
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                sumaNegativos += numero;
            }
        }

        // Mostrar la suma de valores positivos y negativos
        System.out.println("La suma de los valores positivos es: " + sumaPositivos);
        System.out.println("La suma de los valores negativos es: " + sumaNegativos);

        // Cerrar el Scanner
        scanner.close();
		
		
		
	}

}
