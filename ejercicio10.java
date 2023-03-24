/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo
de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un
formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter
tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
las siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicios1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correctas = 0, incorrectas = 0;
        int largo = 0;
        String letra1, letra2;
        boolean siga = true;
        //-------------------------------------------------

        while (siga == true) {
            System.out.println("ingrese cadena RS232 ");
            cadena = leer.next();
            if (cadena.equals("&&&&&")) {
                siga = false;
            }
            letra1 = (String) substring(cadena, 0, 1);
            letra2 = (String) substring(cadena, 4, 5);
            largo = (int) length(cadena);
            if ((largo <= 5) && (letra1.equals("x")) && (letra2.equals("o"))) {
                correctas = correctas + 1;

            } else {
                incorrectas = incorrectas + 1;
            }
System.out.println("correctas " + correctas + " incorrectas " + incorrectas );
        }

    }

}
