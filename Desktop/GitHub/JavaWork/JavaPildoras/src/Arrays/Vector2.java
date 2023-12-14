package Arrays;

import java.util.*;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un array para almacenar los números reales
        double[] numerosReales = new double[10];

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar diez números reales y calcular la suma
        System.out.println("Ingrese diez números reales:");
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosReales[i] = scanner.nextDouble();
            suma += numerosReales[i];
        }

        // Mostrar la suma de todos los valores ingresados
        System.out.println("La suma de los valores es: " + suma);

        // Cerrar el Scanner
        scanner.close();
    }

		
	}


