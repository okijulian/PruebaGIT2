/*
Ejercicio10
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int cont=0;
        
        System.out.println("ingrese un numero Limite");
        
        int limite=sc.nextInt();      
       
        while (cont <= limite){
        
            System.out.println("Ingrese un numero");
            int numero=sc.nextInt();
            cont=numero+cont;              
            
        }     System.out.println("limite alcanzado");
                
    }
    
}
