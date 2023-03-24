/*
Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una
opción y el programa deberá mostrar el resultado por pantalla y luego
volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
1 sumar 2 restar 3 multiplicar 4 dividir 5 salir
 */
package ejercicios1;

import java.util.Scanner;

public class menuCinco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float n1, n2;
        int menu = 0;
        boolean salir = false;
        String opcSalir;
        System.out.println("ingrese numero uno ");
        n1 = leer.nextFloat();
        System.out.println("ingrese numero dos ");
        n2 = leer.nextFloat();

        while (salir == false) {
            while ((menu <= 0) || (menu > 5)) {
                System.out.println("menu 1 sumar 2 restar 3 multiplicar 4 dividir 5 salir ");
                menu = leer.nextInt();
            }
            switch (menu) {
                case 1:
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    menu = 0;
                    break;
                case 2:
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    menu = 0;
                    break;
                case 3:
                    System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                    menu = 0;
                    break;
                case 4:
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    menu = 0;
                    break;
                case 5:
                    System.out.println("¿Seguro que desea salir? S/N");
                    opcSalir = leer.next();
                    if ((opcSalir.equals("S")) || (opcSalir.equals("s"))) {
                        salir = true;
                    }else{
                    menu= 0;
                    }
                    break;

            }
        }

    }

}
