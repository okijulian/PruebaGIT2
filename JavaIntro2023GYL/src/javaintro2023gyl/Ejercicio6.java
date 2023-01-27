/*
Ejercicio 6

Crear un programa que dado un numero determine si es par o impar.

 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio6 {

  
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        
        double num =sc.nextDouble();
        
        if(num%2 == 0){
            System.out.println("EL NUMERO " + num + " ES PAR" );
        
        }else {
            
            System.out.println("EL NUMERO " + num + " ES IMPAR");}
        
        
    };
    
}
