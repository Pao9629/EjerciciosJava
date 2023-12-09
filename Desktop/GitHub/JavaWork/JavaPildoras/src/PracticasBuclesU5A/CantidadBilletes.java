package PracticasBuclesU5A;

import java.util.*;

public class CantidadBilletes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce la candidad de euros (múltiple de 5): ");
		
		int cantidadEuros= scanner.nextInt();
		
		int[] tiposDeBilletes = {500, 200, 100, 50, 20, 10, 5};

		System.out.println("Los billetes necesarios para " + cantidadEuros + " euros son:");

		for (int billete : tiposDeBilletes) {
		    if (cantidadEuros >= billete) {
		        int cantidadDeBilletes = cantidadEuros / billete;
		        cantidadEuros %= billete;
		        System.out.println(cantidadDeBilletes + " billete(s) de " + billete + " euros");
		    }
		}

		
		
	}

}
