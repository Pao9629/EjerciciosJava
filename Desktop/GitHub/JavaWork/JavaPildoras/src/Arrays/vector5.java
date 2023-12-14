package Arrays;

import java.util.*;

public class vector5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un array para almacenar los números reales
        double[] numerosReales = new double[20];

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar veinte números reales
        System.out.println("Ingrese veinte números reales:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosReales[i] = scanner.nextDouble();
        }

        // Calcular la suma de todos los valores
        double suma = 0;
        for (double numero : numerosReales) {
            suma += numero;
        }

        // Calcular y mostrar la media de los valores
        double media = suma / 20;
        System.out.println("La media de los valores es: " + media);

        // Cerrar el Scanner
        scanner.close();
    }

		
		
	}


