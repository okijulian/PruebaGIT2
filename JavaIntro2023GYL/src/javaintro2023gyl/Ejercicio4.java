/*
Ejercicio4 

Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura  ambiente en grados centigrados.");
        
        double C = sc.nextDouble();
        
        double F = (32+(9*C/5));
        
        System.out.println("Los grados en Fahrenheit es:  "+ F );
        
    }
    
}
