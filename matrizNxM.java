/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos
 */
package eggcooperation;

import java.util.Random;
import java.util.Scanner;

public class matrizNxM {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int M = 3;
        int N = 3;
        int[][] mat = new int[3][3];

        LLenar(mat);
        Mues(mat);
        System.out.println();
        Suma(mat);
      
    }
    //-----------------------------------

    public static void LLenar(int[][] mat) {
        Random suerte = new Random();

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                int k = (int) ((suerte.nextDouble() * 20) - 10);
                mat[i][j] = k;
            }
        }
    }

    //--------------------------------
    public static void Mues(int[][] mat) {

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    //------------------------------   
    public static void Suma(int[][] mat) {
        int suma = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
              suma+= mat[i][j];
            }
        }
        
        System.out.println(suma);
    }

}
