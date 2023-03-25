/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package eggcooperation;
import java.util.
import java.util.Scanner;

public class sopaDeLetras {

    public static void main(String[] args) {
        String[][] sopa = new String[20][20];//defino matriz sopa de 20x20
        Inic(sopa);
        String palabra = "";
        for (int i = 0; i <= 4; i++) {
            Valido();//lee palabra y valida su largo entre 3 yy 5
LLeno(String[][]sopa,String palabra);
        }
    }
    //-----------------

    public static String Valido() {
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        System.out.println("ingrese palabra de entre tres y cinco caracteres");
        palabra = leer.next();
        int largo = palabra.length();
        if ((largo < 3) || (largo > 5)) {
            System.out.println("ingrese palabra de entre tres y cinco caracteres");
            palabra = leer.next();
        }
        return palabra;
    }

    //-------------------------------
    public static void Inic(String[][] sopa) {
        for (int i = 0; i <= 19; i++) {
            for (int j = 0; j <= 19; i++) {
                sopa[i][j] = "";
            }
        }
    }

    //---------------------------------
   public static void LLeno(String[][]sopa,String palabra){
       String letra="";
       int largo = palabra.length();
       for (int i = 0; i <= (largo-1); i++){
           letra = palabra.substring(i, i+1);
       }
   }
    

    
    
    
    
    //-----------------------
}
