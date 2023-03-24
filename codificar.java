/*
Escribir un programa que procese una secuencia de caracteres ingresada
por teclado y terminada en punto, y luego codifique la palabra o frase
ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 */
package ejercicios1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;
import static jdk.nashorn.internal.objects.NativeString.substring;
//-------------------------------------------------------

public class codificar {
//-------------------------------------------------------

    public static void main(String[] args) {
        //-----------------------------------------

        Scanner leer = new Scanner(System.in);
        //-------------------------
        int largo = 0;
        String palabra = "";
        System.out.println("ingrese palabra y punto ");
        palabra = leer.nextLine();
        largo = (int) length(palabra);
        String ultima = substring(palabra, (largo - 1), largo);
        //------------------------------------------------
//        System.out.println(ultima);
//        boolean veraz;
//        veraz = (!(ultima.equals(".")));
//        System.out.println(veraz);
//---------------------------------------------------------
        while (!(ultima.equals("."))) {
            System.out.println("ingrese nuevamente palabra y punto");
            palabra = leer.nextLine();
        }
        //----------------------------------------------
        System.out.println(palabra);
        String frase;
        frase = Codifica(palabra);
        System.out.println(frase);
//   largo = (int)length(palabra);
//   String letra;
//   letra = substring(palabra,largo-1,largo);
//   System.out.println(letra);
        //-----------------termina main procedure
    }

    //------------------aca van las funciones
    public static String Codifica(String palabra) {
        String frase;
        frase = "";
        int largo;
        largo = (int) length(palabra);
        String letra;
        for (int i = 0; i <= largo - 1; i++) {
            letra = substring(palabra, i, i + 1);
            switch (letra) {
                case "a":
                    letra = "@";
                    frase = frase.concat(letra);
                    break;
                case "e":
                    letra = "#";
                    frase = frase.concat(letra);
                    break;
                case "i":
                    letra = "$";
                    frase = frase.concat(letra);
                    break;
                case "o":
                    letra = "%";
                    frase = frase.concat(letra);
                    break;
                case "u":
                    letra = "&";
                    frase = frase.concat(letra);
                    break;
                default:
                    frase = frase.concat(letra);

            }

        }

        return frase;
    }

}
