package ExplicacionesJavaBasics;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// Evaluar que tipo de caracter con charArt (no es estatico)
		// y tipo lenght (longitud de una cadena de carácteres)
		
		int arroba=0;
		
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for (int i=0; i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				
				arroba++;
			}
			
			if(mail.charAt(i)=='.') {
			
				punto=true;
			}

		} 
		
		if(arroba==1 && punto==true){
			
			System.out.println("Es correcto");
		} else{
			System.out.println("No es correcto");
		
		}	
	}	
		
}		
		

	
	

