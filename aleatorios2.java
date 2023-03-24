/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package ejercicios1;

import java.util.Scanner;

public class aleatorios2 {

    public static void main(String[] args) {
        int[] m = new int[10];
        int num = 0;
        LLenar(m);
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        Buscar(num, m);

    }

    //------------------------
    public static void LLenar(int[] m) {
        for (int i = 0; i <= 9; i++) {
            m[i] = (int) (Math.random() * 100);
        }

                for (int i = 0; i <= 9; i++) {
           System.out.print( m[i]+" ");
        }
    }

    //----------------
    public static void Buscar(int num, int[] m) {
        boolean enc = false;
        int cont=0;
        for (int i = 0; i <= 9; i++) {
            if (num == m[i]) {
                enc = true;
                cont++;
            }
        }
        if (enc==true){
            System.out.println(num+" encontrado "+cont+" veces ");
        }else{
            System.out.println("numero no encontrado");
        }
    }
    //-------------------------

}
