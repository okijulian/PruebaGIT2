/*

Ejercicio 14

 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package javaintro2023gyl;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese  a que moneda quieres convertir los euros");

        System.out.println("---------");
        System.out.println("DOLAR");
        System.out.println("LIBRA");
        System.out.println("YENES");
        System.out.println("---------");
        System.out.println();

        String moneda = sc.next().toUpperCase();
        System.out.println();

        System.out.println("Ingrese la cantidad de euros: ");
        System.out.println("");
        double euros = sc.nextDouble();
        System.out.println();

        convertir(euros, moneda);

    }

    public static void convertir(double euros, String moneda) {

        switch (moneda) {

            case "LIBRA":
                System.out.println(euros + " euros son en libras: " + euros * 0.86 + " libras");
                break;

            case "DOLAR":
                System.out.println(euros + " euros son en dolares : " + euros * 1.28611 + " dolares");
                break;

            case "YENES":
                System.out.println(euros + "  euros son en yenes: " + euros * 129.852 + " yenes");
                break;
        }
    }
}
