/*
 Escriba un programa que pida una frase o palabra y valide si
la primera letra de esa frase es una ‘A’. Si la primera letra es
una ‘A’, se deberá de imprimir un mensaje por pantalla que diga
“CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package ejercicios1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class empiezA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("frase ");
        frase = leer.next();

        String frase2 = substring(frase, 0, 1);
if (frase2.equals("A")){
        System.out.println("correcto ");
}else {
        System.out.println("incorrecto ");
}
    }

}
