package ArraysMatrices;

import java.util.*;

public class Matrices4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        final int ESTUDIANTES = 4;
        final int ASIGNATURAS = 5;

        double[][] notas = new double[ESTUDIANTES][ASIGNATURAS];

        // Ingresar notas de los estudiantes por teclado
        for (int i = 0; i < ESTUDIANTES; i++) {
            System.out.println("Ingrese las notas del Estudiante " + (i + 1) + ":");
            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.println("Ingrese la nota de la Asignatura " + (j + 1) + ":");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Calcular y mostrar mínimo, máximo y promedio por estudiante
        for (int i = 0; i < ESTUDIANTES; i++) {
            double min = notas[i][0];
            double max = notas[i][0];
            double suma = 0;

            for (int j = 0; j < ASIGNATURAS; j++) {
                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }
                suma += notas[i][j];
            }

            double promedio = suma / ASIGNATURAS;
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("Nota mínima: " + min);
            System.out.println("Nota máxima: " + max);
            System.out.println("Promedio: " + promedio);
        }

        scanner.close();
    }
		
}

