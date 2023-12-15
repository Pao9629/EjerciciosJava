package ArraysString;

import java.util.*;

public class Cadenas4Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Introduce una frase: ");
		String frase = scanner.nextLine().toLowerCase();
		
		int contadorA = 0, contadorE =0, contadorI = 0, contadorO = 0, contadorU = 0;
		
		for (char letra: frase.toCharArray()) {
			switch (letra) {
			
			case 'a':
				contadorA++;
				break;
			 case 'e':
                 contadorE++;
                 break;
             case 'i':
                 contadorI++;
                 break;
             case 'o':
                 contadorO++;
                 break;
             case 'u':
                 contadorU++;
                 break;
			
			}
		}
		// Mostrar la cantidad de cada vocal
        System.out.println("Núm. de A's: " + contadorA);
        System.out.println("Núm. de E's: " + contadorE);
        System.out.println("Núm. de I's: " + contadorI);
        System.out.println("Núm. de O's: " + contadorO);
        System.out.println("Núm. de U's: " + contadorU);
		
        
        scanner.close();
	}

}
