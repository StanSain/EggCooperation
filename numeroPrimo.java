/*
Crea una aplicación que nos pida un número por teclado y con una función se 
lo pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por
ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package ejercicios1;

import java.util.Scanner;

public class numeroPrimo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        boolean primo = false;
        System.out.println("ingrese numero");
        num = leer.nextInt();
        primo = Averigua(num);
        System.out.println("numero  " + num + " primo = " + primo);

    }
//----------------------------------------------finmain

    public static boolean Averigua(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
