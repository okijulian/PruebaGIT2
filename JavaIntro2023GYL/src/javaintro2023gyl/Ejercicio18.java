/*
Ejercicio 18

Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package javaintro2023gyl;

public class Ejercicio18 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int matriztranspuesta[][] = new int[4][4];

        System.out.println("Matriz Origen");
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 4 ; j++) {
                
                matriz[i][j] = (int) (Math.random() * 99) + 1;
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("");
        transpuesta(matriz, matriztranspuesta);
        
    }

    public static void transpuesta(int matriz[][], int matriztranspuesta[][]) {
        
        System.out.println("");        
        System.out.println("matriz transpuesta");
        System.out.println("");
        
        for (int j = 0; j < 4 ; j++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int i = 0; i < 4; i++) {
                matriztranspuesta[j][i]=matriz[i][j];
                System.out.print(matriztranspuesta[j][i] + " ");
               

            }
        }
    }
}
