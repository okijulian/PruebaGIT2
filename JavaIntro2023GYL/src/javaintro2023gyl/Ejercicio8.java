/*
Ejercicio 8

Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.

 */
package javaintro2023gyl;

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una palabra o frase");
        
        String palabra = sc.nextLine();
        
        if(palabra.length()<=8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        };
        
        
    }
    
}
