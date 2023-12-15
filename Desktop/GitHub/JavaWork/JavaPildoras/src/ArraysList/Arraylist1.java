package ArraysList;

import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        ArrayList<String> comandos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú:");
            System.out.println("1. Afegir comanda.");
            System.out.println("2. Mostrar llista de comandes.");
            System.out.println("3. Sortir.");
            System.out.println("Seleccioneu una opció:");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Introduïu la comanda:");
                    String comanda = scanner.nextLine();
                    comandos.add(comanda);
                    System.out.println("Comanda afegida amb èxit!");
                    break;
                case 2:
                    System.out.println("Llista de comandes:");
                    for (String cmd : comandos) {
                        System.out.println(cmd);
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
