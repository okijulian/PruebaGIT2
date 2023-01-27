/*
Ejercicio 9

 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.

 */

package javaintro2023gyl;

import java.util.Scanner;


public class Ejercicio9 {

 
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa una frase o palabra");
        
        String palabra = sc.nextLine();
        
        if (palabra.substring(0,1).equals("A")){            
            System.out.println("CORRECTO");            
        }else{            
            System.out.println("INCORRECTO");
        }        
    }    
}
