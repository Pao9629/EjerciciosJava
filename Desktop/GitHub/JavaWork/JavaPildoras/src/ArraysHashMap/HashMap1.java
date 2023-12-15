package ArraysHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Map<String, Integer> puntajesJugadores = new HashMap<>();

	        boolean continuar = true;

	        while (continuar) {
	            System.out.println("1. Añadir nuevo jugador y puntaje.");
	            System.out.println("2. Mostrar puntajes actuales.");
	            System.out.println("3. Salir.");
	            System.out.println("Seleccione una opción:");

	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Ingrese el nombre del jugador:");
	                    scanner.nextLine(); // Limpiar el buffer del scanner
	                    String nombre = scanner.nextLine();

	                    System.out.println("Ingrese el puntaje del jugador:");
	                    int puntaje = scanner.nextInt();

	                    puntajesJugadores.put(nombre, puntaje);
	                    System.out.println("¡Puntaje registrado!");
	                    break;
	                case 2:
	                    if (puntajesJugadores.isEmpty()) {
	                        System.out.println("No hay puntajes registrados aún.");
	                    } else {
	                        System.out.println("Puntajes actuales:");
	                        for (Map.Entry<String, Integer> entry : puntajesJugadores.entrySet()) {
	                            System.out.println(entry.getKey() + ": " + entry.getValue());
	                        }
	                    }
	                    break;
	                case 3:
	                    continuar = false;
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    break;
	            }
	        }

	        scanner.close();
	}

}
