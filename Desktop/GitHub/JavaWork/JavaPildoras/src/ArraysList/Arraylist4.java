package ArraysList;

import java.util.*;

public class Arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<String> palabras = new ArrayList<>();

	        System.out.println("Ingrese palabras (ingrese 'fin' para terminar la entrada):");

	        while (true) {
	            String palabra = scanner.nextLine();
	            if (palabra.equals("fin")) {
	                break;
	            }
	            palabras.add(palabra);
	        }

	        HashSet<String> conjuntoPalabras = new HashSet<>(palabras);
	        palabras.clear();
	        palabras.addAll(conjuntoPalabras);

	        System.out.println("Lista sin palabras repetidas:");
	        for (String palabra : palabras) {
	            System.out.println(palabra);
	        }

	        scanner.close();
	}

}
