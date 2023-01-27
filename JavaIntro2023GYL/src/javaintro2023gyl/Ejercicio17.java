/*
Ejercicio 17

Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). 


 */
package javaintro2023gyl;

public class Ejercicio17 {

    public static void main(String[] args) {

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        int arreglo[] = contador();

        cuenta(arreglo, cont1, cont2, cont3, cont4, cont5);
    }

    public static int[] contador() {

        int arreglo[] = new int[25];
        System.out.println("Vector resultado");
        
        for (int i = 0; i <= 25-1; i++) {
            arreglo[i] = (int) (Math.random() * 15000) + 1;
            System.out.println(arreglo[i] + " ");
        }
        return arreglo;
    }

    public static void cuenta(int arreglo[], int cont1, int cont2, int cont3, int cont4, int cont5) {

        for (int i = 0; i <= 25-1; i++) {
            int digitos = (int) (Math.log10(arreglo[i] + 1));
            switch (digitos) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;

                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;

            }
        }
        System.out.println("Los numeros que tienen  1 digitos son: " + cont1);
        System.out.println("Los numeros que tienen  2 digitos son: " + cont2);
        System.out.println("Los numeros que tienen  3 digitos son: " + cont3);
        System.out.println("Los numeros que tienen  4 digitos son: " + cont4);
        System.out.println("Los numeros que tienen  5 digitos son: " + cont5);

    }

}
