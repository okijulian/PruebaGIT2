/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro2023gyl;

/**
 *
 * @author okisan
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int matriztranspuesta[][] = new int[4][4];
        boolean band = true;

        System.out.println("Matriz Origen");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");

            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 3) + 2;
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println(" ");
        transpuesta(matriz, matriztranspuesta);
        antisimetrica(matriz, matriztranspuesta, band);

    }

    public static void transpuesta(int matriz[][], int matriztranspuesta[][]) {

        System.out.println(" ");
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriztranspuesta[j][i] = matriz[i][j];
                System.out.print(matriztranspuesta[j][i] + " ");

            }
        }
    }

    public static void antisimetrica(int matriz[][], int matriztranspuesta[][], boolean band) {
        System.out.println(" ");
        System.out.println("Matriz Negativa");
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                System.out.print(((-1) * matriztranspuesta[i][j]) + " ");
                if (matriztranspuesta[i][j] != matriz[i][j]) {
                    band = false;

                }
            }
        }
        if (band) {
            System.out.println(" ");
            System.out.println("Es una Matriz Antisimétrica");
        } else {
            System.out.println(" ");
            System.out.println(" No es antisimetrico");
        }

    }
}
