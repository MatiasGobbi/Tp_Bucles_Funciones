package Funciones;

/*
 Ejercicio 9: Calcular el precio final con descuentos
Una empresa quiere calcular el precio final de sus productos después de aplicar
un descuento general del 10%.

**Instrucciones**:
- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada
producto y devuelva el precio final.
*/

import java.util.Scanner;

public class Ej9Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de productos
        System.out.print("¿Cuántos productos deseas registrar? ");
        int cantidadProductos = scanner.nextInt();

        // Crear un arreglo para almacenar los precios originales
        double[] preciosOriginales = new double[cantidadProductos];

        // Solicitar los precios originales de los productos
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el precio original del producto " + (i + 1) + ": ");
            preciosOriginales[i] = scanner.nextDouble();
        }

        // Llamar a la función para calcular los precios finales
        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

        // Mostrar los resultados
        System.out.println("\nPrecios finales con descuento aplicado:");
        for (int i = 0; i < preciosOriginales.length; i++) {
            System.out.printf("Producto %d: Precio original: $%.2f, Precio final: $%.2f%n",
                    (i + 1), preciosOriginales[i], preciosFinales[i]);
        }
    }

    // Función para calcular el precio final con un descuento del 10%
    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double[] preciosFinales = new double[preciosOriginales.length];

        // Aplicar el descuento a cada producto
        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] * 0.90; // Aplicar 10% de descuento
        }

        return preciosFinales;
    }
}
