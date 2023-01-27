/*

    Ejercicio 20

 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejerciocio20 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca los valores de la matriz 3x3");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();

                if (num >= 1 && num <= 9) {

                    matriz[i][j] = num;

                } else {
                    System.out.println("numeros sumera el limite");
                  j--;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");

            }

        }

    }

}
