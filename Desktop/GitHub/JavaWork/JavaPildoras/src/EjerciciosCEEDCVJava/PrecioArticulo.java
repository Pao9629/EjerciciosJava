package EjerciciosCEEDCVJava;

import java.util.*;

public class PrecioArticulo {

	public static void main(String[] args) {
		// . Escriu un programa que donat el preu d'un article i
		//el preu de venda real ens mostre el
		//percentatge de descompte realitzat

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Escribe el precio de un articulo: ");
		
		double precioArticulo= scanner.nextDouble();
		
		System.out.print("Escribe el precio de venta real: ");
		
		double precioVentaReal= scanner.nextDouble();
		
		//Ahora calculemos el porcentaje de descuento
		
		double descuento=precioArticulo-precioVentaReal;
		double porcentajeDescuento=(descuento/precioArticulo)*100;
		
		System.out.println("El porcentaje de descuento realizado es " + descuento + "%");
		
		scanner.close(); //Cerramos el scanner
		
		
		
		
		
		
	}

}
