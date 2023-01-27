/*
Ejercicio 7 

Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.

 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio7 {

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Ingresa la palabra clave");
        
        String  palabra = sc.next();
        
        if(palabra.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto ");
        }
        
        
    }
    
}
