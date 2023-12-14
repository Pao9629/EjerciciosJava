package Arrays;

import java.util.*;

public class vector7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar dos valores enteros P y Q
        System.out.print("Ingrese el valor de P: ");
        int P = scanner.nextInt();

        System.out.print("Ingrese el valor de Q: ");
        int Q = scanner.nextInt();

        // Calcular la cantidad de elementos para el array
        int tamañoArray = Math.abs(Q - P) + 1; // +1 para incluir Q

        // Crear el array con los valores desde P hasta Q
        int[] array = new int[tamañoArray];
        int valor = P;
        for (int i = 0; i < tamañoArray; i++) {
            array[i] = valor;
            valor += (P < Q) ? 1 : -1; // Aumenta o disminuye según la dirección
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
