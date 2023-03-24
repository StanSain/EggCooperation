/*
*Implementar un programa que le pida dos números enteros al usuario 
*y determine si ambos o alguno de ellos es mayor a 25.
*/
package ejercicios1;
import java.util.Scanner;
/**
 * @author Hernan Sain
 */
public class dosNumeros {


    public static void main(String[] args) {
int num1;
int num2;
Scanner teclado = new Scanner(System.in);
System.out.println("ingrese numero1 entero");
num1 = teclado.nextInt();
System.out.println("ingrese numero2 entero");
num2 = teclado.nextInt();
if (num1 > 25 || num2 > 25){
System.out.println("alguno excede de 25");
}else{
System.out.println("ambos numeros dentro de rango");
}
    }
    
}
