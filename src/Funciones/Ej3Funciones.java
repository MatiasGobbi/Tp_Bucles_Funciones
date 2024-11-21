package Funciones;

/*
 Ejercicio 3: Gestión de clientes
Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar
facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.

**Instrucciones**:
- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo
`facturasPendientes` con el monto de sus facturas pendientes.
- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con
facturas mayores a $500.
*/

import java.util.Scanner;

public class Ej3Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de clientes
        System.out.print("¿Cuántos clientes deseas registrar? ");
        int cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear arreglos para nombres de clientes y facturas pendientes
        String[] clientes = new String[cantidadClientes];
        double[] facturasPendientes = new double[cantidadClientes];

        // Solicitar los datos de los clientes
        for (int i = 0; i < cantidadClientes; i++) {
            System.out.print("Ingrese el nombre del cliente " + (i + 1) + ": ");
            clientes[i] = scanner.nextLine();

            System.out.print("Ingrese el monto de la factura pendiente de " + clientes[i] + ": ");
            facturasPendientes[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Llamar a la función para enviar facturas
        enviarFacturas(clientes, facturasPendientes);
    }

    // Función para procesar los clientes y enviar facturas mayores a $500
    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("\nClientes con facturas mayores a $500:");

        // Recorrer los arreglos
        boolean hayFacturasPendientes = false;
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) { // Si la factura es mayor a $500
                System.out.println(clientes[i] + " - Factura pendiente: $" + facturasPendientes[i]);
                hayFacturasPendientes = true;
            }
        }

        if (!hayFacturasPendientes) {
            System.out.println("No hay clientes con facturas mayores a $500.");
        }
    }
}
