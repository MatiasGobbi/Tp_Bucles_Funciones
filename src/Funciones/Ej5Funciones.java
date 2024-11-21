package Funciones;

/*
Ejercicio 5: Promedio de satisfacción del cliente
Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas
de calificación de 1 a 5.

**Instrucciones**:
- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el
promedio de satisfacción.
*/

import java.util.Scanner;

public class Ej5Funciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de calificaciones a registrar
        System.out.print("¿Cuántos clientes participaron en la encuesta? ");
        int cantidadCalificaciones = scanner.nextInt();

        // Crear un arreglo para almacenar las calificaciones
        int[] calificaciones = new int[cantidadCalificaciones];

        // Solicitar las calificaciones
        for (int i = 0; i < cantidadCalificaciones; i++) {
            int calificacion;
            do {
                System.out.print("Ingrese la calificación del cliente " + (i + 1) + " (1 a 5): ");
                calificacion = scanner.nextInt();
            } while (calificacion < 1 || calificacion > 5); // Validar que esté entre 1 y 5
            calificaciones[i] = calificacion;
        }

        // Llamar a la función para calcular el promedio de satisfacción
        double promedio = calcularPromedioSatisfaccion(calificaciones);

        // Mostrar el promedio
        System.out.printf("El promedio de satisfacción de los clientes es: %.2f%n", promedio);
    }

    // Función para calcular el promedio de satisfacción
    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0;

        // Recorrer el arreglo y sumar las calificaciones
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        // Calcular y retornar el promedio
        return (double) suma / calificaciones.length;
    }
}
