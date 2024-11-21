package Funciones;

/*
 Ejercicio 7: Descuento por compras grandes
Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

**Instrucciones**:
- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
*/

import java.util.Scanner;

public class Ej7Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de compras
        System.out.print("¿Cuántas compras deseas registrar? ");
        int cantidadCompras = scanner.nextInt();

        // Crear un arreglo para almacenar los montos de las compras
        double[] compras = new double[cantidadCompras];

        // Solicitar los montos de las compras
        for (int i = 0; i < cantidadCompras; i++) {
            System.out.print("Ingrese el monto de la compra " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
        }

        // Llamar a la función para aplicar los descuentos
        double[] descuentos = aplicarDescuento(compras);

        // Mostrar los resultados
        System.out.println("\nCompras con descuento aplicado:");
        for (int i = 0; i < compras.length; i++) {
            if (descuentos[i] > 0) {
                System.out.printf("Compra %d: Monto original: $%.2f, Descuento: $%.2f, Total con descuento: $%.2f%n",
                        (i + 1), compras[i], descuentos[i], compras[i] - descuentos[i]);
            } else {
                System.out.printf("Compra %d: Monto original: $%.2f, No califica para descuento%n",
                        (i + 1), compras[i]);
            }
        }
    }

    // Función para aplicar el descuento del 15% a compras mayores a $500
    public static double[] aplicarDescuento(double[] compras) {
        double[] descuentos = new double[compras.length];

        // Calcular el descuento para cada compra
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) { // Si la compra supera $500
                descuentos[i] = compras[i] * 0.15; // Calcular el 15% del monto
            } else {
                descuentos[i] = 0; // No hay descuento si no supera $500
            }
        }

        return descuentos;
    }
}
