package Iterativas;
/*
Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
Instrucciones:
Pide al usuario ingresar la cantidad de empleados.
Para cada empleado, pide ingresar las horas trabajadas.
Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
*/

import java.util.Scanner;

public class Ej2Bucles {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados: ");
        int cant_empleados = sc.nextInt();

        // Tarifa fija por hora
        final int tarifa_por_hora = 15;

        // Bucle para calcular el salario de cada empleado
        for (int i = 1; i <= cant_empleados; i++) {
            System.out.println("Ingrese las horas trabajadas por el empleado " + i + ": ");
            int horas_trabajadas = sc.nextInt();
            int salario = horas_trabajadas * tarifa_por_hora;
            System.out.println("El salario correspondiente al empleado " + i + " es: $" + salario);

        }
    }
}
