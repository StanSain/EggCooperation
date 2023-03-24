/*
preguntar nombre y edad y decidir si es mayor o menor, preguntar si quiere 
agregar otro
 */
package ejercicios1;

import java.util.Scanner;

public class NombreYEdad {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int edad;
        String nombre;
        String condicion;
        boolean seguir = true;
        int opc = 0;
                  Scanner leer = new Scanner(System.in);
        //-------------------------------
        while (seguir == true) {
            System.out.println("ingrese nombre y edad ");
            nombre = leer.next();
            edad = leer.nextInt();
            condicion = Verifica(edad);
            System.out.println(nombre + " es " + condicion);
            System.out.println("otro= 1");
            opc = leer.nextInt();
            if ((opc == 1)) {
                seguir = true;
            } else {seguir = false;}
        }
    }

//----------fin main 

public static String Verifica(int edad){
    String condicion;
    if (edad>=18){
    condicion = "mayor";}else{condicion="menor";}
    return condicion;
    }
}
