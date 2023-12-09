package PracticandoBuclesU5;

import java.util.*;

public class MaestroJediNotas1al10yvalornegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean tieneNotaDiez = false;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Introduce las notas (valores de 0 a 10). Ingresa -1 para terminar:");
		
		int nota;
		
		do { 
			
			nota=scanner.nextInt();
			
			if (nota ==10) {
				tieneNotaDiez = true;
			}
			
		}while (nota!= -1);
		
		if (tieneNotaDiez) {
			System.out.println("Se introdujo al menos una nota con valor 10");
		
		}else {
			System.out.println("No se introdujo ninguna nota con valor 10.");
		
		scanner.close();
		}
		
	}

}
