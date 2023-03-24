/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar . La aplicación debe tener una función para cada
operación matemática y debe devolver sus resultados para imprimirlos en el main.*/
int n1;
int n2;
int opc = 0 ;
int salir = 0;
        Scanner leer = new Scanner(System.in);

System.out.println("ingrese numero uno ");
n1 = leer.nextInt();
System.out.println("ingrese numero dos ");
n2 = leer.nextInt();

while (opc == 0 || opc > 4){
System.out.println("ingrese opcion- 1: suma , 2: resta , 3: multiplica ");        
opc  = leer.nextInt();


switch (opc){
   case 1:
        System.out.print("n1 + n2 = ");
        System.out.println(n1+n2);
    break;
   case 2:
        System.out.print("n1 - n2 = ");
        System.out.println(n1-n2);
        break;
   case 3:
        System.out.print("n1 x n2 = ");
        System.out.println(n1*n2);
        break;

        }



       


    }
    
    }
}
