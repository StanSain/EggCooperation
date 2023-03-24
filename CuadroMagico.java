/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9
 */
package ejercicios1;

import java.util.Scanner;

public class CuadroMagico {

    public static void main(String[] args) {

        int[][] mat = new int[3][3];
        Inic(mat);
        Rell(mat);
        Verif(mat);
    }
//-----------------------------------------------------------------

    public static void Inic(int[][] mat) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                mat[i][j] = 0;
            }
        }
    }
//---------------------------------------------------

    public static void Rell(int[][] mat) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                mat[i][j] = leer.nextInt();
            }
        }
    }
//------------------------------------------------------

    public static void Verif(int[][] mat) {
        boolean mag = true;
        int suma1 = 0;
        int suma2 = 0;
        //--- suma1 0 a la suma de la fila 0---------
        for (int j = 0; j <= 2; j++) {
            suma1 = suma1 + mat[0][j];
        }
        //------------------------------
        //-suma2 = suma de la fila 1
        for (int j = 0; j <= 2; j++) {
            suma2 = suma2 + mat[1][j];
        }
        //------compara
        if (!(suma1 == suma2)) {
            mag = false;
        }
//        System.out.println(suma2+" "+mag);
        //----paso a la fila 3 
        suma2 = 0;
        for (int j = 0; j <= 2; j++) {
            suma2 = suma2 + mat[2][j];
        }
        //------compara
        if (!(suma1 == suma2)) {
            mag = false;
        }
//         System.out.println(suma2+" "+mag);
//--------- diagonal ppal-------------
        suma2 = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (mat[i][j] == mat[j][i]) {
                    suma2 = suma2 + mat[i][j];
                }
            }
        }

        if (!(suma1 == suma2)) {
            mag = false;
        }
//        System.out.println(suma2+" "+mag);

//------------diagonal opuesta
        suma2 = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i + j == 2) {
                    suma2 = suma2 + mat[i][j];
                }
            }
//            if (!(suma1 == suma2)) {
//                mag = false;
//            }

        }
        System.out.println(suma1 + "   " + suma2 + " " + mag);
System.out.println("la matriz es magica "+mag);
    }

    //----------------------------------
}
