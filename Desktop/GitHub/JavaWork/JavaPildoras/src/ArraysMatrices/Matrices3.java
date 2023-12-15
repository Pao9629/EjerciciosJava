package ArraysMatrices;

import java.util.*;

public class Matrices3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario el tamaño de la matriz (N x M)
	        System.out.println("Ingrese el número de filas (N):");
	        int filas = scanner.nextInt();
	        System.out.println("Ingrese el número de columnas (M):");
	        int columnas = scanner.nextInt();

	        int[][] matriz = new int[filas][columnas];

	        // Ingresar valores en la matriz
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.println("Ingrese el valor para la posición [" + (i + 1) + "][" + (j + 1) + "]:");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        // Contar cuántos valores son mayores, menores o iguales a cero
	        int mayoresCero = 0, menoresCero = 0, igualCero = 0;

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                if (matriz[i][j] > 0) {
	                    mayoresCero++;
	                } else if (matriz[i][j] < 0) {
	                    menoresCero++;
	                } else {
	                    igualCero++;
	                }
	            }
	        }

	        // Mostrar los resultados por pantalla
	        System.out.println("Cantidad de valores mayores que cero: " + mayoresCero);
	        System.out.println("Cantidad de valores menores que cero: " + menoresCero);
	        System.out.println("Cantidad de valores iguales a cero: " + igualCero);

	        scanner.close();
	}

}
