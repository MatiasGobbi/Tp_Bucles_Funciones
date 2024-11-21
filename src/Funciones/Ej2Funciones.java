package Funciones;

/*
Ejercicio 2: Generar reportes de inventario
Una tienda de electrónica necesita un informe del inventario, mostrando los productos
 que tienen menos de 5 unidades en stock.

**Instrucciones**:
- Crea un arreglo `productos` que almacene los nombres de los productos y otro arreglo
 `stocks` que almacene la cantidad de stock de cada producto.
- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.
*/

import java.util.Scanner;

public class Ej2Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de productos
        System.out.print("¿Cuántos productos deseas registrar? ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del número

        // Crear arreglos para almacenar los nombres de los productos y sus stocks
        String[] productos = new String[cantidadProductos];
        int[] stocks = new int[cantidadProductos];

        // Solicitar los nombres y stocks de los productos
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();

            System.out.print("Ingrese la cantidad en stock de " + productos[i] + ": ");
            stocks[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Llamar a la función para generar el reporte
        generarReporteBajoStock(productos, stocks);
    }

    // Función para generar el reporte de bajo stock
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("\nProductos con bajo stock (menos de 5 unidades):");

        // Recorrer los productos y verificar sus stocks
        boolean hayProductosConBajoStock = false;
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) { // Si el stock es menor a 5
                System.out.println(productos[i] + " - Unidades: " + stocks[i]);
                hayProductosConBajoStock = true;
            }
        }

        if (!hayProductosConBajoStock) {
            System.out.println("Todos los productos tienen suficientes unidades.");
        }
    }
}
