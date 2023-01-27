/*

EJERCICIO 12

Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.


 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int acumulador1 = 0;
        int acumulador2 = 0;
        System.out.println("Ingresa una frase o palabra");

        String frase = sc.nextLine();

        int caracteres = frase.length();

        while (!"&&&&&".equals(frase)) {

            if (caracteres == 5) {

                if (frase.substring(0, 1).equals("X") && frase.substring(4, 5).equals("O")) {

                    acumulador1++;

                } else {
                    acumulador2++;
                }

            } else {
                System.out.println("cantidad de caracteres supera o faltan");
            }
            System.out.println("Ingresa una frase o palabra");
            frase = sc.nextLine();
        }

        System.out.println("la cantidad de correstos es: " + acumulador1);
        System.out.println("la cantidad de incorrectos es: " + (acumulador2));
    }
}
