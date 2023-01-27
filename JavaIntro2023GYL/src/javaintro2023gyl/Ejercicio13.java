/*

Ejercicio 13

Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */

package javaintro2023gyl;

import java.util.Scanner;


public class Ejercicio13 {

    public static void main(String[] args) {
      
        Scanner sc=  new Scanner(System.in); 
        
        System.out.println("Ingrese  la dimension del cuadrado");
        
        int dimension =sc.nextInt();
        
        for (int i =0 ; i<dimension; i++ ){
            for(int j=0;j<dimension; j++){
                if(i==0 || i == dimension-1 || j==0 ||j ==dimension-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        
    }
    
}
