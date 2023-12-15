package ArraysHashMap;

import java.util.*;

public class HashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        Map<String, Producto> inventario = new HashMap<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Añadir nuevo producto al inventario.");
            System.out.println("2. Mostrar inventario.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opción:");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el precio unitario del producto:");
                    double precio = scanner.nextDouble();

                    System.out.println("Ingrese la cantidad disponible:");
                    int cantidad = scanner.nextInt();

                    Producto producto = new Producto(nombre, precio, cantidad);
                    inventario.put(nombre, producto);
                    System.out.println("¡Producto agregado al inventario!");
                    break;
                case 2:
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío.");
                    } else {
                        System.out.println("Inventario actual:");
                        for (Map.Entry<String, Producto> entry : inventario.entrySet()) {
                            Producto p = entry.getValue();
                            System.out.println("Producto: " + p.getNombre() + ", Precio unitario: " + p.getPrecio()
                                    + ", Cantidad: " + p.getCantidad() + ", Total acumulado: " + p.getTotal());
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

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
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

}
