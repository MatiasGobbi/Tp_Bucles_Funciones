/*
Ejercicio 3: Control de inventario
Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene
menos de 5 unidades disponibles para realizar un pedido.
Instrucciones:
Pide al usuario ingresar el número de productos.
Usa un bucle para ingresar la cantidad disponible de cada producto.
Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar
un pedido.
*/

import java.util.Scanner;
public class Ej3Bucles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int minimo_unidades = 5;

        System.out.println("Ingrese la cantidad de productos:");
        int cant_productos = sc.nextInt();

        for (int i = 1; i < cant_productos + 1; i++) {
            System.out.println("Ingrese la cantidad disponoble del artículo " + i + " que posee en su inventario:");
            int cant_disponible = sc.nextInt();

            if (cant_disponible < minimo_unidades) {
                System.out.println("El producto necesita reposición!");
            }
        }
    }
}