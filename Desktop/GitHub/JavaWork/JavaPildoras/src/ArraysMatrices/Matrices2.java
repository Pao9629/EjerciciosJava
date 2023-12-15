package ArraysMatrices;

public class Matrices2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[10][10]; // Crear una matriz de tamaño 10x10 para las tablas de multiplicar

        // Llenar la matriz con las tablas de multiplicar del 1 al 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1); // Asignar el resultado de la multiplicación a cada posición
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz de 10x10 con las tablas de multiplicar del 1 al 10:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // Mostrar cada elemento de la matriz
            }
            System.out.println(); // Cambiar de línea para la siguiente fila de la matriz
        }
	}

}
