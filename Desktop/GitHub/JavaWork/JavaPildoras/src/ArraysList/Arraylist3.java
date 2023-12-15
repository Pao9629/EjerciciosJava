package ArraysList;

import java.util.*;
public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introdueixi números enters (per a finalitzar, introduïu un número negatiu):");

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
        }

        double suma = 0;
        int cantidad = 0;

        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) {
                suma += numeros.get(i);
                cantidad++;
            }
        }

        if (cantidad > 0) {
            double media = suma / cantidad;
            System.out.println("La mitjana dels números a les posicions parelles és: " + media);
        } else {
            System.out.println("No s'han trobat números a les posicions parelles.");
        }

        scanner.close();
		
	}

}
