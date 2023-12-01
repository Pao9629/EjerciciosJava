package JavaU4;

import java.util.*;



public class HorasYSegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Solicitar la hora, minutos y segundos al usuario
	        System.out.print("Introduce la hora (formato de 24 horas): ");
	        int horas = scanner.nextInt();

	        System.out.print("Introduce los minutos: ");
	        int minutos = scanner.nextInt();

	        System.out.print("Introduce los segundos: ");
	        int segundos = scanner.nextInt();

	        // Incrementar los segundos
	        segundos++;

	        // Verificar si se superaron los 59 segundos para ajustar los minutos
	        if (segundos >= 60) {
	            segundos = 0;
	            minutos++;

	            // Verificar si se superaron los 59 minutos para ajustar las horas
	            if (minutos >= 60) {
	                minutos = 0;
	                horas++;

	                // Verificar si se superaron las 23 horas para ajustar a 00:00:00
	                if (horas >= 24) {
	                    horas = 0;
	                }
	            }
	        }

	        // Mostrar el tiempo incrementado en un segundo
	        System.out.println("Después de un segundo, la hora será: " + horas + ":" + minutos+0 + ":" + segundos+0);
        

	}

}
