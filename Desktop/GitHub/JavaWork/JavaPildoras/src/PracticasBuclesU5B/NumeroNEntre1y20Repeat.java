package PracticasBuclesU5B;

import java.util.*;


public class NumeroNEntre1y20Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 20: ");
        int N = scanner.nextInt();

        if (N >= 0 && N <= 20) {
            for (int i = 1; i <= N; i++) {
                // Imprime los espacios en blanco para la alineación en forma de pirámide
                for (int j = N - i; j > 0; j--) {
                    System.out.print("  ");
                }
                // Imprime el número i repetido i veces en una misma línea
                for (int j = 0; j < i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println(); // Salto de línea para la siguiente iteración
            }
        } else {
            System.out.println("El número introducido está fuera del rango especificado.");
        }

        scanner.close();
    }
}
