package ejercicios1;

import java.util.Scanner;

public class simpleArrayDeclaration {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] lista = new int[3];
        llenarVector(lista);
        escribirVector(lista);

    }

//------------------------------------------------------
    public static void llenarVector(int[] lista) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            lista[i] = leer.nextInt();
        }
    }
//---------------------------------------

    public static void escribirVector(int[] lista) {
        for (int i = 0; i <= 2; i++) {
            System.out.print("[" + lista[i] + "]" + " " );
}
    }

}
