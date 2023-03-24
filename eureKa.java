/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un
mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función
equals() en J
 */
package ejercicios1;
import java.util.Scanner;
public class eureKa 
{
    public static void main(String[] args) {
Scanner tecla = new Scanner(System.in);
String frase = " ";
String compara = "eureka";
System.out.println("frase ");
frase = tecla.next();

System.out.println("frase " + frase );
if (frase.equals(compara)){
System.out.println("Correcto ");
}else{
System.out.println("Incorrecto ");
}
    }
    
}
