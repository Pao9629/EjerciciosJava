package ArraysString;

import java.util.*;
import javax.swing.*;

public class Cadenas3Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		String apellido1 = JOptionPane.showInputDialog("Ingrese el primer apellido:");
		String apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido:");
		
		//Obtener las tres primeras letras de cada cadena
		
		String codigoUsuario = (nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3)).toUpperCase();
		
		JOptionPane.showMessageDialog(null, "El codigo de usuario es" + codigoUsuario);
	}

}
