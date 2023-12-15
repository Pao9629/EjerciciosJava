package ArraysString;

import java.util.*;

public class Cadenas5Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar una frase
        System.out.println("Ingrese una frase para verificar si es un palíndromo:");
        String fraseOriginal = scanner.nextLine();

        // Eliminar espacios y convertir a minúsculas
        String frase = fraseOriginal.replaceAll("\\s+", "").toLowerCase();

        // Obtener la versión invertida de la frase
        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        // Verificar si la frase es un palíndromo
        if (frase.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        // Cerrar el Scanner
        scanner.close();
		
		
	}

}
