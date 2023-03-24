/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como 
indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejercicios1;

import java.util.Scanner;

public class Asteriscos {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int num = 0;
        int contador = 0;
        while (contador <= 4) {
            while ((num <= 0) || (num > 20)) {
                System.out.println("ingrese numero ");
                num = tecla.nextInt();
            }
            System.out.print(num + " ");
            while (num > 0) {
                System.out.print(" * ");
                num = num - 1;
            }
            contador = contador + 1;
            num = 0;
        }

    }

}
