package EjerciciosCEEDCVJava;

import javax.swing.*;
import java.util.*;

public class Adivinanzas {

	public static void main(String[] args) {
		// Vamos a divertirnos un ratete

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Añade 
        //el tipo random para generar numeros aleatorios
        int intentos = 0;
        //Ahora intenta no confundir las variables
        boolean haAdivinado = false;

        // Si esto sale bien será un milagro
        
        JOptionPane.showMessageDialog(null, "Pero vamos a ver..., adivina! Intenta adivinar el número entre 1 y 100.");

        // Lo que una tiene que hacer para aprenderse 
        //los bucles
        
        while (!haAdivinado) {
        	String input = JOptionPane.showInputDialog("Introducir adivinanza:");
        	int intento; 
             try {
                intento = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
                continue;
            }
            intentos++;

            if (intento == numeroAleatorio) {
                haAdivinado = true;
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            } else if (intento < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El número es mayor. Sigue intentándolo.");
            } else {
                JOptionPane.showMessageDialog(null, "El número es menor. Sigue intentándolo.");
            }
        }
		
	}
}

