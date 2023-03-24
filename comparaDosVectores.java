/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package ejercicios1;
import java.util.Scanner;
import java.util.Random;

public class comparaDosVectores {

    public static void main(String[] args) {
        boolean ig = true;
        
        int[] v1 = new int[4];
        LLenaVect(v1);
        Mues(v1);
        System.out.println();
        int[] v3 = new int[4];
        LLen(v3);
        Comp(v1,v3);

    }

    //------------------------------
    public static void LLenaVect(int[] v1) {
        Random num = new Random();
        for (int i = 0; i <= 3; i++) {
            int n = (int) ((num.nextDouble() * 20) - 10);
            v1[i] = n;
     
        }
    }
    //--------------------------------

    public static void Mues(int[] v1) {
        for (int i = 0; i <= 3; i++) {
            System.out.print((v1[i] + " "));
        }

    }
//--------------------------------------------
        public static void LLen(int[] v3) {
       Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            v3[i] = leer.nextInt();
        }
    }
        //-------------------------------------
    public static void Comp(int[]v1,int[]v2){
        boolean ig = true;
       for (int i = 0; i <= 3; i++){
           if(!(v1[i]==v2[i])){
               ig=false;
           }
       }   
       System.out.println("los dos vectores son iguales = "+ig);
    }
    //---------------------------------------------------
}
