package Iterativas;
/*
Ejercicio 4: Registro de ventas diarias
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa
debe calcular el total de ventas al final de la semana.
Instrucciones:
Usa un bucle para registrar las ventas diarias durante 7 días.
Al final del bucle, muestra el total de ventas de la semana.
*/

import java.util.Scanner;
public class Ej4Bucles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int[] cant_ventas_totales = new int[7];

        for (int i = 0; i < 7 ; i++) {
            System.out.println("Ingrese las ventas del día " + (i + 1) + ":");
            int cant_ventas_por_dia = sc.nextInt();
            cant_ventas_totales[i] = cant_ventas_por_dia;
        }
        int total_ventas = 0;
        for (int ventas : cant_ventas_totales) {
            total_ventas += ventas;
        }

        System.out.println("La suma total de ventas es: " + total_ventas);

    }
}
