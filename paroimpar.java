/*Estructuras de Control -Ejercicios de Aprendizaje Ej 1
determinar si un numero es par o impar
 */
package ejercicios1;

import java.util.Scanner;

public class paroimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("ingrese numero ");
        num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("numero par ");
        } else {
            System.out.println("numero impar ");
        }

    }

}
