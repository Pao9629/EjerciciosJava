package Arrays;

import java.util.*;

public class ArraysVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un array para almacenar los números
		
        double[] numerosReales = new double[10];

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar diez números reales
        System.out.println("Ingrese diez números reales:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosReales[i] = scanner.nextDouble();
        }

        // Mostrar todos los valores almacenados en el array
        System.out.println("\nValores ingresados:");
        for (double numero : numerosReales) {
            System.out.println(numero);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
