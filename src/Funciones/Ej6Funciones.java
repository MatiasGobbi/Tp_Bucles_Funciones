package Funciones;

/*
Ejercicio 6: Cálculo de impuestos
Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.

**Instrucciones**:
- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
*/

import java.util.Scanner;

public class Ej6Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de facturas
        System.out.print("¿Cuántas facturas deseas registrar? ");
        int cantidadFacturas = scanner.nextInt();

        // Crear un arreglo para almacenar los montos de las facturas
        double[] facturas = new double[cantidadFacturas];

        // Solicitar los montos de las facturas
        for (int i = 0; i < cantidadFacturas; i++) {
            System.out.print("Ingrese el monto de la factura " + (i + 1) + ": ");
            facturas[i] = scanner.nextDouble();
        }

        // Llamar a la función para calcular el impuesto
        double[] impuestos = calcularImpuesto(facturas);

        // Mostrar los resultados
        System.out.println("\nFacturas con impuestos aplicados:");
        for (int i = 0; i < facturas.length; i++) {
            System.out.printf("Factura %d: Monto original: $%.2f, Impuesto: $%.2f, Total con impuesto: $%.2f%n",
                    (i + 1), facturas[i], impuestos[i], facturas[i] + impuestos[i]);
        }
    }

    // Función para calcular el impuesto del 21% para cada factura
    public static double[] calcularImpuesto(double[] facturas) {
        double[] impuestos = new double[facturas.length];

        // Calcular el impuesto para cada factura
        for (int i = 0; i < facturas.length; i++) {
            impuestos[i] = facturas[i] * 0.21; // Calcular el 21% del monto
        }

        return impuestos;
    }
}
