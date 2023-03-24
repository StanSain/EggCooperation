/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de
los números introducidos supere el límite inicial.

 */
package ejercicios1;
import java.util.Scanner;

public class limtePositivo {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int lim,num;
int suma = 0;

System.out.println("ingrese limite positivo ");
lim = leer.nextInt();
System.out.println("limite " + lim );
while (suma <= lim){
System.out.println("ingrese numero menor que " + lim );
num = leer.nextInt();
suma = suma + num;
System.out.print(suma + " " );

}

    }
    
}
