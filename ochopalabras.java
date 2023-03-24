/*
Realizar un programa que solo permita introducir solo frases
o palabras de 8 de largo. Si el usuario ingresa una frase o palabra 
de 8 de largo se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicios1;

import java.util.Scanner;

public class ochopalabras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int largo = 0;
        System.out.println("ingrese frase ");
        frase = leer.next();
        System.out.println(frase.length());
largo = frase.length();

if (largo == 8){
System.out.println("correcto ");
}else {
System.out.println(" Incorrecto ");
}
    }
}
