/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
 */
package eggcooperation;

import java.util.Scanner;

public class sopa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String[][] sopa = new String[20][20];
        System.out.println("ingrese palabra entre 3 y 5 caracteres");
        palabra = leer.next();
        int largo = palabra.length();
        while (largo < 3 || largo > 5) {
            System.out.println("ingrese palabra entre 3 y 5 caracteres");
            palabra = leer.next();
            largo = palabra.length();

        }
        inicio(sopa);
        for (int i = 0; i <= 4; i++) {
            sopa[0][i] = palabra.substring(i, i + 1);
        }
        for (int i = largo ; i <= 19; i++) {
            Integer num = (int) (Math.random() * 10);
            String num2 = num.toString();
            sopa[0][i] = num2;
        }
        
        muestro(sopa);
        
        
    }

    //--------------------------------------
    public static void muestro(String[][] sopa) {
        for (int i = 0; i <= 19; i++) {
            for (int j = 0; j <= 19; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }

    }

    //--------------------
    public static void inicio(String[][] sopa) {
        for (int i = 0; i <= 19; i++) {
            for (int j = 0; j <= 19; j++) {
                Integer num = (int)( Math.random()*10);
                String num2 = num.toString();
                sopa[i][j] = num2;
            }
        }
    }
    //---------------------------------

    //-------------------
}
