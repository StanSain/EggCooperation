/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = 
 */
package ejercicios1;

import java.util.Scanner;

public class antisimetrica {

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int[][] mat2 = new int[3][3];
        Inic(mat);
        Inic(mat2);
        System.out.println("ingrese nueve enteros positivos o negativos ");
        Rell(mat);
        Tran(mat, mat2);
        Imp(mat);
        System.out.println();
        Imp(mat2);
        Comp(mat,mat2);
    }
//-----------------------------------------------

    public static void Inic(int[][] mat) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                mat[i][j] = 0;
            }
        }
    }
//---------------------------------------

    public static void Rell(int[][] mat) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                mat[i][j] = leer.nextInt();
            }
        }
    }

    //----------------------------
    public static void Tran(int[][] mat, int[][] mat2) {

        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                mat2[i][j] = (mat[j][i]*(-1));
            }

        }

    }

    //----------------------------------------
    public static void Imp(int[][] mat) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
//-----------------------------

    public static void Comp(int[][] mat, int[][] mat2) {
        boolean at = true;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (!(mat[i][j] == (mat2[i][j]*(-1)))) {
                    at = true;
                }else{
                    at=false;
                }
            }

        }
      System.out.print("las matrices son antitetanicas   "+at);  
    }

}
