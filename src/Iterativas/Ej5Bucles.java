package Iterativas;
/*
Ejercicio 5: Cálculo de horas extras
Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado
trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
Instrucciones:
Pide al usuario ingresar el número de empleados.
Usa un bucle para ingresar las horas trabajadas por cada empleado.
Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
*/

import java.util.Scanner;
public class Ej5Bucles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados:");
        int cant_empleados = sc.nextInt();
        int[] horas = new int[cant_empleados];

        for (int i = 0; i < cant_empleados ; i++) {
            System.out.println("Ingrese las horas trabajdas del empleado: " + (i + 1));
            int horas_trabajadas = sc.nextInt();
            horas[i] = horas_trabajadas;
            if (horas[i] > 40){
                int horas_extra = 40;
                horas[i] -= horas_extra;
                System.out.println("Este empleado trabajó: " + horas[i] + " horas extra!");
            }
        }
    }
}
