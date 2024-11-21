package Funciones;
/*
Ejercicio 1: Cálculo de ingresos mensuales
Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función
que use un bucle para calcular los ingresos totales mensuales.

**Instrucciones**:
- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
- Imprime el total de ingresos mensuales.
*/

import java.util.Scanner;

public class Ej1Funciones {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        // Arreglo para almacenar las ventas diarias (30 días)
        double[] ventas = new double[30];

        // Solicitar al usuario que ingrese las ventas diarias
        System.out.println("Ingresa las ventas diarias de la tienda durante 30 días:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        // Llamar a la función para calcular los ingresos mensuales
        double ingresosTotales = calcularIngresosMensuales(ventas);

        // Imprimir el total de ingresos
        System.out.println("El total de ingresos mensuales es: $" + ingresosTotales);
    }

    // Función para calcular los ingresos mensuales
    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0; // Variable acumuladora

        // Recorrer el arreglo y sumar las ventas
        for (double venta : ventas) {
            total += venta;
        }

        return total; // Retornar la suma total
    }
}
