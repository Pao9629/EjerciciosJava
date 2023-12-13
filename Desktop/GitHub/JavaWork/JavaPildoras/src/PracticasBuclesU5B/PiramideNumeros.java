package PracticasBuclesU5B;

import java.util.*;

public class PiramideNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                // Imprime espacios en blanco para alinear la pirámide
                for (int j = num - i; j > 0; j--) {
                    System.out.print("  ");
                }
                // Imprime números ascendentes
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Imprime números descendentes
                for (int j = i - 1; j > 0; j--) {
                    System.out.print("* ");
                }
                System.out.println(); // Salto de línea para la siguiente fila
            }
        } else {
            System.out.println("Por favor, introduce un número positivo.");
        }

        scanner.close();
		
		
		
	}

}
