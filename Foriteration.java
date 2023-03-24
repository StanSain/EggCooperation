/*
escribir numeros de 0 a 9 usando la estructura for
 */
package ejercicios1;

import java.util.Scanner;

public class Foriteration {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        Escribo(num);
    }
//--------------fin

    public static void Escribo(int num) {
        num = 0;
        for (int i = 0; i <= 9; i++) {
        System.out.print(i+" ");
        }
    }

}
