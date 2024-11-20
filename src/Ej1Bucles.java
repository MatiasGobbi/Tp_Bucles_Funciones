/*
Ejercicio 1: Cálculo del tiempo dedicado a cada actividad.
Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Instrucciones:
Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
*/

import java.util.Scanner;

public class Ej1Bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] actividades = {"Estudiar", "Hacer ejercicios", "Leer", "Tiempo libre"};
        int totalHoras = 0;

        // Bucle para pedir horas por cada actividad
        for (String actividad : actividades) {
            System.out.print("¿Cuántas horas dedicas a " + actividad + "? ");
            int horas = scanner.nextInt();
            totalHoras += horas;
        }
        System.out.println("El tiempo total dedicado a tus actividades es: " + totalHoras + " horas.");
    }
}
