/*
Escriba un programa que valide si una nota está entre 0 y 10, sino esta
́ entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package ejercicios1;
import java.util.Scanner;
/**
 * @author John
 */
public class NotaEj8 {
    public static void main(String[] args) {
int nota = -1;
Scanner tecla = new Scanner(System.in);
do {
    System.out.println("ingrese nota ");
nota = tecla.nextInt();
}while ((nota < 0) || (nota > 10));

System.out.println("nota " + nota );

    }
    
}
