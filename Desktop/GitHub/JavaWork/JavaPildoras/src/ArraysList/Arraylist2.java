package ArraysList;

import java.util.*;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> contactos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú:");
            System.out.println("1. Afegir contacte.");
            System.out.println("2. Mostrar llista de contactes.");
            System.out.println("3. Sortir.");
            System.out.println("Seleccioneu una opció:");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Introduïu el nom del contacte:");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduïu el número de telèfon:");
                    String telefono = scanner.nextLine();
                    contactos.add("Nom: " + nombre + ", Telèfon: " + telefono);
                    System.out.println("Contacte afegit amb èxit!");
                    break;
                case 2:
                    System.out.println("Llista de contactes:");
                    for (String contacto : contactos) {
                        System.out.println(contacto);
                    }
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opció no vàlida. Intenteu-ho de nou.");
                    break;
            }
        }

        scanner.close();
		
	}

}
