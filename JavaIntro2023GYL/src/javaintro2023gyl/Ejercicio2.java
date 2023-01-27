/**Ejercicio 2 : escribir un programa que pida tu nombre  lo guarde en una variable y lo muestre por consola**/

package javaintro2023gyl;

import java.util.Scanner;

/**
 *
 * @author okisan
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre");
        
        String nombre = sc.next();
        
        System.out.println("El nombre que ingresaste  fue: "+nombre);
        
    }
    
}
