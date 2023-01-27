/*
 Ejercicio5 

Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in); 
        
        System.out.print("Ingresa un numero: ");
        
        int num= sc.nextInt(); 
        
        System.out.println("El doble del numero Ingresado es: " + num*2);
        
        System.out.println("El tripre del numero Ingresado es: "+ num*3);
        
        System.out.println("La raiz cuadrada del mismo  numero ingresado es "+ Math.sqrt(num));
        
    }
    
}
