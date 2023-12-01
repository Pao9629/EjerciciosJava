package JavaU4;

import java.util.*;

public class NotasClasseOrdenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota entre 0 y 10: ");
        
        double nota= scanner.nextDouble();
        
        String notaAlfabetica;
        
        if (nota >= 0 && nota < 3) {
            notaAlfabetica = "Molt Deficient";
        } else if (nota >= 3 && nota < 5) {
            notaAlfabetica = "Insuficient";
        } else if (nota >= 5 && nota < 6) {
            notaAlfabetica = "Bé";
        } else if (nota >= 6 && nota < 9) {
            notaAlfabetica = "Notable";
        } else if (nota >= 9 && nota <= 10) {
            notaAlfabetica = "Excel·lent";
        } else {
            notaAlfabetica = "Calificación fuera de rango";
        }

        System.out.println("Calificación alfabética: " + notaAlfabetica);
		
	}

}
