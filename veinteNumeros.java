/*
Escriba un programa que lea 20 números. Si el número leído es igual a 
cero se debe salir del bucle y mostrar el mensaje "Se capturó
el numero cero".  El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número 
es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicios1;
import java.util.Scanner;

public class veinteNumeros {

    public static void main(String[] args) {
  int num1;
  int contador = 0;
  int suma = 0;
  Scanner tecla = new Scanner(System.in);
  while (contador < 20 ){
      System.out.println("ingrese numero " + (contador + 1) );
      num1 = tecla.nextInt();
      if (num1 == 0){
      System.out.println("Se capturó el numero cero"); 
      break;
      }else{
      suma = suma + num1;
      contador = contador + 1;
      }

  }
        System.out.println("suma de los 20 numeros " + suma );
    }
    
}
