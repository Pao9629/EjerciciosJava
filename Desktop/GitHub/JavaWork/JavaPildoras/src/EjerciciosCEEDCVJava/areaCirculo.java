package EjerciciosCEEDCVJava;

import java.util.*;

public class areaCirculo {

	public static void main(String[] args) {
		
	// Para que aparezca scanner debes importar primero
		// luego añadimos la pantalla para que entre (recuerda
		//la sintaxis 
		
	Scanner scanner=new Scanner(System.in);
	
	//Aqui añadimos lo que le aparecerá al usuario en pantalla
		
	System.out.print("Ingresa la longitd del radio:");
	
	// Ahora tenemos que leer la entrada del usuario y almacenarla
	// pero claro puede ser almacenada como decimal así que usaremos el metodo 
	// double de Scanner
	
	double ratio = scanner.nextDouble();
	
	// Ahora procedemos a los calculos porque se va almacenar y lo usaremos
	//para dichos calculos
	
	
	double longitudCircunferencia= 2 * Math.PI *ratio;
	
	double areaCirculo=Math.PI * Math.pow(ratio, 2);
	
	double volumenEsfera= (4.0/3.0)*Math.PI*Math.pow(ratio,3);
	
	System.out.println("La longitud de la circunferencia es :" + longitudCircunferencia );
	System.out.println("El área del círculo es " + areaCirculo);
	System.out.println("El volumen de la esfera es:" + volumenEsfera);
	
	}

}