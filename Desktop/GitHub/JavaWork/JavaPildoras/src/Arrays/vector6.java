package Arrays;

import java.util.*;

public class vector6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar dos valores enteros N y M
        System.out.print("Ingrese el valor de N (tamaño del array): ");
        int N = scanner.nextInt();

        System.out.print("Ingrese el valor de M (valor a colocar en el array): ");
        int M = scanner.nextInt();

        // Crear un array de tamaño N y asignar el valor M en todas sus posiciones
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = M;
        }

        // Mostrar el array resultante
        System.out.println("El array resultante es:");
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }

        // Cerrar el Scanner
        scanner.close();
		
		
		
	}

}
