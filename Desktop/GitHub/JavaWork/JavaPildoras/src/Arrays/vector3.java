package Arrays;

import java.util.Scanner;

public class vector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double[] numerosReales = new double[10];

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar diez números reales
        System.out.println("Ingrese diez números reales:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosReales[i] = scanner.nextDouble();
        }

        // Encontrar el máximo y mínimo
        double maximo = numerosReales[0];
        double minimo = numerosReales[0];
        for (int i = 1; i < 10; i++) {
            if (numerosReales[i] > maximo) {
                maximo = numerosReales[i];
            }
            if (numerosReales[i] < minimo) {
                minimo = numerosReales[i];
            }
        }

        // Mostrar el máximo y mínimo
        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);

        // Cerrar el Scanner
        scanner.close();
		
	}

}
