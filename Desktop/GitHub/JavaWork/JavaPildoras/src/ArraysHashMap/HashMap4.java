package ArraysHashMap;

import java.util.*;

public class HashMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
        Map<String, Gasto> gastos = new HashMap<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Añadir nuevo gasto.");
            System.out.println("2. Mostrar gastos.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opción:");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la categoría del gasto:");
                    String categoria = scanner.nextLine();

                    System.out.println("Ingrese el precio unitario del gasto:");
                    double precioGasto = scanner.nextDouble();

                    System.out.println("Ingrese la cantidad gastada:");
                    int cantidadGasto = scanner.nextInt();

                    Gasto gasto = new Gasto(precioGasto, cantidadGasto);
                    if (gastos.containsKey(categoria)) {
                        Gasto gastoExistente = gastos.get(categoria);
                        gastoExistente.actualizarGasto(precioGasto, cantidadGasto);
                    } else {
                        gastos.put(categoria, gasto);
                    }
                    System.out.println("¡Gasto agregado!");
                    break;
                case 2:
                    if (gastos.isEmpty()) {
                        System.out.println("No hay gastos registrados aún.");
                    } else {
                        System.out.println("Gastos actuales:");
                        for (Map.Entry<String, Gasto> entry : gastos.entrySet()) {
                            Gasto g = entry.getValue();
                            System.out.println("Categoría: " + entry.getKey() + ", Precio unitario: " + g.getPrecio()
                                    + ", Cantidad gastada: " + g.getCantidad() + ", Total acumulado: " + g.getTotal());
                        }
                    }
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }

        scanner.close();
	}

}

class Gasto {
    private double precio;
    private int cantidad;

    public Gasto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return precio * cantidad;
    }

    public void actualizarGasto(double precio, int cantidad) {
        this.precio += precio;
        this.cantidad += cantidad;
    }
}





