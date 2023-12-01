package JavaU4;

import java.util.*;

public class CalcularSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del trabajador: ");
        
        String nombre = scanner.nextLine();

        System.out.print("Introduce el número de horas trabajadas: ");
        
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Introduce la tarifa por hora: ");
        
        double tarifaPorHora = scanner.nextDouble();

        double salarioBruto = 0;

        if (horasTrabajadas <= 35) {
            
        	salarioBruto = horasTrabajadas * tarifaPorHora;
      
        } else {
            
        	salarioBruto = 35 * tarifaPorHora + (horasTrabajadas - 35) * tarifaPorHora * 1.5;
        }

        double salarioNeto = calcularSalarioNeto(salarioBruto);

        double impuestos = salarioBruto - salarioNeto;

        System.out.println("Nombre del trabajador: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto + " euros");
        System.out.println("Impuestos: " + impuestos + " euros");
        System.out.println("Salario neto: " + salarioNeto + " euros");
    }

		public static double calcularSalarioNeto(double salarioBruto) {
        
			double salarioNeto;
        
			if (salarioBruto <= 500) {
         
				salarioNeto = salarioBruto;
        
			} else if (salarioBruto <= 900) {
          
				salarioNeto = 500 + (salarioBruto - 500) * 0.75;
       
			} else {
           
				salarioNeto = 500 + 400 * 0.75 + (salarioBruto - 900) * 0.55;
        }
        
			return salarioNeto;
	}

}
