/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicios1;

import java.util.Scanner;

public class cuadradoAsteriscos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension;
        System.out.println("ingrese dimension ");
        dimension = leer.nextInt();
//-------------------primera linea de * -----------------
        for (int i = 1; i <= dimension; i++) {
            System.out.print(" * ");
        }
//------------------ inserta linea --------------------------------------
        System.out.println();
//------------- repetir dimension-2 veces
for ( int f = 1; f <= (dimension-2); f++){
//--------------------- inseerta un * -----------------------------------
        System.out.print(" * ");
//--------------- inserta blancos -----------------------
        for (int g = 1; g <= (dimension - 2); g++) {
            System.out.print("   ");
        }
//--------------------- inseerta un * -----------------------------------
        System.out.print(" * ");
//------------------ inserta linea --------------------------------------
        System.out.println();
//----------------- inserta linea de * ----------------------------------
}
//--------- fin de repetir dimension-2 ------------

//-------------- inserta linea de * --------------
        for (int i = 1; i <= dimension; i++) {
            System.out.print(" * ");
        }
// -----------  inserta linea final -----------
        System.out.println();

    }
}
