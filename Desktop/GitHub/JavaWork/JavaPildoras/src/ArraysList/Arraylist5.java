package ArraysList;

import java.util.*;

import java.util.*;

public class Arraylist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese números (ingrese un número negativo para finalizar):");

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
        }

        System.out.println("Lista original: " + numeros);

        Collections.reverse(numeros);

        System.out.println("Lista invertida: " + numeros);

        scanner.close();
	}

}
