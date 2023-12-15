package ArraysMatrices;

public class Matrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] matriz = new int[5][5]; // Crear una matriz de tamaño 5x5
        int numero = 1; // Inicializar el número a almacenar en la matriz

        // Llenar la matriz con los números del 1 al 25
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero; // Asignar el número a la posición actual de la matriz
                numero++; // Incrementar el número para la siguiente posición
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz de 5x5 con los números del 1 al 25:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // Mostrar cada elemento de la matriz
            }
            System.out.println(); // Cambiar de línea para la siguiente fila de la matriz
        }
	}

}
