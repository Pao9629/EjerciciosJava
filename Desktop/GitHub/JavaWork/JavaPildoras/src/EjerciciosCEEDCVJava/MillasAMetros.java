package EjerciciosCEEDCVJava;

import java.util.*;

public class MillasAMetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Introduce la distancia en millas:");
	
	double millas = scanner.nextDouble();
	
	final double METROS_POR_MILLA=1852;
	
	double metros= millas * METROS_POR_MILLA;
	
	System.out.println("La distancia en metros es " + metros + " metros");
	}

}
