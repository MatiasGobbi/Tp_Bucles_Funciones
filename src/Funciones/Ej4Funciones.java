package Funciones;

/*
Ejercicio 4: Cálculo de descuentos para fidelización
Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han
realizado. Si han comprado más de 10 veces, reciben un 10% de descuento.

**Instrucciones**:
- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a
los clientes que califiquen.
*/

import java.util.Scanner;

public class Ej4Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de clientes
        System.out.print("¿Cuántos clientes deseas registrar? ");
        int cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear arreglos para nombres de clientes y cantidad de compras
        String[] clientes = new String[cantidadClientes];
        int[] compras = new int[cantidadClientes];

        // Solicitar los datos de los clientes
        for (int i = 0; i < cantidadClientes; i++) {
            System.out.print("Ingrese el nombre del cliente " + (i + 1) + ": ");
            clientes[i] = scanner.nextLine();

            System.out.print("Ingrese la cantidad de compras realizadas por " + clientes[i] + ": ");
            compras[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Llamar a la función para calcular los descuentos
        calcularDescuentos(clientes, compras);

    }

    // Función para calcular descuentos
    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("\nClientes que califican para descuentos:");

        // Recorrer los arreglos y aplicar descuentos a quienes califiquen
        boolean hayClientesConDescuento = false;
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) { // Califican para un descuento del 10%
                System.out.println(clientes[i] + " - Compras: " + compras[i] + " (Descuento aplicado: 10%)");
                hayClientesConDescuento = true;
            }
        }

        if (!hayClientesConDescuento) {
            System.out.println("No hay clientes que califiquen para descuentos.");
        }
    }
}
