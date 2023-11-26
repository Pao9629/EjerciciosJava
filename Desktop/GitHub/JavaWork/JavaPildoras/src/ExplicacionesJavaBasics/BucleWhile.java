package ExplicacionesJavaBasics;

import javax.swing.*;

public class BucleWhile {

	public static void main(String[] args) {
		// Aqui darememos los bucles se dividen en
		/* Indeterminados (while "mientras-(condicion)" y do while) y determinados
		 * que son for y for-each(sabemos las veces de repetición) 
		*/ 
		 String clave="Paola";
		 
		 String pass="";
		 
		 while (clave.equals(pass)==false){
			 
			 pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			 
			 if (clave.equals(pass)==false){
				 
				 System.out.println("No puedes PAASAAAR");
			
			 	}
			 }
			 
		 	System.out.println("Contraseña correcta. Venga va, entra");
		 }

	}


