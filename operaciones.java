/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
función para cada operación matemática y deben devolver sus resultados
para imprimirlos en el main. 
 */
package ejercicios1;

import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float n1;
        float n2;
        int menu = 0;
        float resultado = 0;
        boolean salir = false;
//-----------------------------------------------
        System.out.println("ingrese numero uno");
        n1 = leer.nextInt();
        System.out.println("ingrese numero dos");
        n2 = leer.nextInt();
//------------------------------------------
        while (salir == false) {
        System.out.println("menu 1 sumar 2 restar 3 multiplicar 4 dividir 5 salir");
        menu = leer.nextInt();

        while ((menu == 0) || (menu > 5)) {
            System.out.println("menu 1 sumar 2 restar 3 multiplicar 4 dividir 5 salir");
            menu = leer.nextInt();
        }

            switch (menu) {
                case 1:
                    resultado = sumar(n1, n2);
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = restar(n1, n2);
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = multiplicar(n1, n2);
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = dividir(n1, n2);
                    System.out.println(resultado);
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }
    }
    //-------------------- fin main -------------------funciones

    public static int sumar(float n1, float n2) {
        float suma;
        suma = n1 + n2;
        return (int) suma;
    }
//--------------------

    public static int restar(float n1, float n2) {
        float resta;
        resta = n1 - n2;
        return (int) resta;
    }
//-------------------------------

    public static int multiplicar(float n1, float n2) {
        float prod;
        prod = n1 * n2;
        return (int) prod;
    }
//--------------------------------

    public static float dividir(float n1, float  n2) {
        float div;
        div = n1 / n2;
        return  div;
    }

}
