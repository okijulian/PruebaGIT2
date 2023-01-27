/*
Ejercicio3:  Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);         
       
        
        System.out.println(" Ingrese una frase ");
        
        String frase= sc.nextLine(); 
        
        System.out.println("La frase ingresada fue: "+frase);
        
        System.out.println("La frase todo en Mayusculas:  "+ frase.toUpperCase());
        
        System.out.println("La frase en Minusculas es: "+ frase.toLowerCase());        
        
    }
    
}
