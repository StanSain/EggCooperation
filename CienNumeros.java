/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package ejercicios1;

public class CienNumeros {

    public static void main(String[] args) {
     int num;
     num=0;
     Escribe(num);
     
    }
    //--------------------
    public static void Escribe(int num){
        for (int i=100;i>0;i--){
            System.out.print(i+" ");
        }
    }
}
