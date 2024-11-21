package Funciones;

/*
Ejercicio 8: Control de horas trabajadas
Una empresa de servicios necesita llevar el control de las horas trabajadas por sus
empleados durante una semana.

**Instrucciones**:
- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo
`horasTrabajadas` con las horas trabajadas en la semana.
- Escribe una función `calcularPagoSemanal` que calcule el pago semanal
(a razón de $15 por hora trabajada).
*/

import java.util.Scanner;

public class Ej8Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de empleados
        System.out.print("¿Cuántos empleados deseas registrar? ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear arreglos para nombres de empleados y horas trabajadas
        int[] empleados = new int[cantidadEmpleados];
        int[] horasTrabajadas = new int[cantidadEmpleados];

        // Solicitar los datos de los empleados
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.print("Ingrese el #ID del empleado " + (i + 1) + ": ");
            empleados[i] = scanner.nextInt();

            System.out.print("Ingrese las horas trabajadas por el empleado #" + empleados[i] + " en la semana: ");
            horasTrabajadas[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Llamar a la función para calcular los pagos semanales
        double[] pagos = calcularPagoSemanal(horasTrabajadas);

        // Mostrar los resultados
        System.out.println("\nPagos semanales:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("Empleado: #%s, Horas trabajadas: %d, Pago semanal: $%.2f%n",
                    empleados[i], horasTrabajadas[i], pagos[i]);
        }
    }

    // Función para calcular el pago semanal (a $15 por hora trabajada)
    public static double[] calcularPagoSemanal(int[] horasTrabajadas) {
        double[] pagos = new double[horasTrabajadas.length];

        // Calcular el pago para cada empleado
        for (int i = 0; i < horasTrabajadas.length; i++) {
            pagos[i] = horasTrabajadas[i] * 15; // Pago por hora trabajada
        }

        return pagos;
    }
}
