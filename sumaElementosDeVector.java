/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package ejercicios1;

import java.util.Scanner;

public class sumaElementosDeVector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] v = new int[10];
        Inic(v);
        LLen(v);
        Mues(v);
    }

//-------------------------------------------------------
    public static void Inic(int[] v) {
        for (int i = 0; i <= 9; i++) {
            v[i] = 0;
        }
    }
    //-------------------------------------

    public static void LLen(int[] v) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            v[i] = leer.nextInt();
        }
    }
//------------------------------------

    public static void Mues(int[] v) {
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.print((v[i] + " "));
            sum += v[i];
        }
        System.out.println(sum);
    }

//-----------------------------
}
