package ArraysHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        Map<String, String> traducciones = new HashMap<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Añadir nueva palabra y su traducción.");
            System.out.println("2. Obtener traducción de una palabra.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opción:");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la palabra en inglés:");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    String palabra = scanner.nextLine();

                    System.out.println("Ingrese la traducción:");
                    String traduccion = scanner.nextLine();

                    traducciones.put(palabra, traduccion);
                    System.out.println("¡Traducción registrada!");
                    break;
                case 2:
                    System.out.println("Ingrese la palabra en inglés:");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    palabra = scanner.nextLine();

                    String traduccionObtenida = traducciones.get(palabra);
                    if (traduccionObtenida != null) {
                        System.out.println("Traducción de '" + palabra + "': " + traduccionObtenida);
                    } else {
                        System.out.println("La palabra no tiene traducción registrada.");
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
