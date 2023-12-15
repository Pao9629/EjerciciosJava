package ArraysMatrices;

import java.util.*;

public class Matrices5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de personas:");
	        int cantidadPersonas = scanner.nextInt();

	        double[][] informacion = new double[cantidadPersonas][2];

	        // Ingresar género y sueldo de cada persona
	        for (int i = 0; i < cantidadPersonas; i++) {
	            System.out.println("Ingrese el género (0 para hombre, 1 para mujer) de la persona " + (i + 1) + ":");
	            informacion[i][0] = scanner.nextDouble();

	            System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ":");
	            informacion[i][1] = scanner.nextDouble();
	        }

	        double sueldoPromedioHombres = 0;
	        double sueldoPromedioMujeres = 0;
	        int contadorHombres = 0;
	        int contadorMujeres = 0;

	        // Calcular el salario promedio de hombres y mujeres
	        for (int i = 0; i < cantidadPersonas; i++) {
	            if (informacion[i][0] == 0) { // Hombre
	                sueldoPromedioHombres += informacion[i][1];
	                contadorHombres++;
	            } else if (informacion[i][0] == 1) { // Mujer
	                sueldoPromedioMujeres += informacion[i][1];
	                contadorMujeres++;
	            }
	        }

	        if (contadorHombres > 0) {
	            sueldoPromedioHombres /= contadorHombres;
	            System.out.println("El sueldo promedio de los hombres es: " + sueldoPromedioHombres);
	        } else {
	            System.out.println("No se ingresaron datos de hombres.");
	        }

	        if (contadorMujeres > 0) {
	            sueldoPromedioMujeres /= contadorMujeres;
	            System.out.println("El sueldo promedio de las mujeres es: " + sueldoPromedioMujeres);
	        } else {
	            System.out.println("No se ingresaron datos de mujeres.");
	        }

	        scanner.close();
		
	}

}
