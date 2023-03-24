/*
make a three dimension array and to write it as a matrix 
 */
package ejercicios1;

import java.util.Scanner;

public class threeDimensionArray {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println();
        int mat[][][] = new int[3][3][3];
        Inicializa(mat);

        
        double num;
num = Math.random()*10;
int num2;
num2 = (int) num;
System.out.println(num);
System.out.println(num2);        
    
LLena(mat);
Muestra(mat);


    }
    //----------------------------------------
    public static void Inicializa(int[][][] mat) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    mat[i][j][k] = 0;
                }
            }
        }
    }
    //-------------------------------------
public static void LLena(int[][][]mat){
    Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    mat[i][j][k] = leer.nextInt();
                }
            }
        }    
}
//----------------------
public static void Muestra(int[][][]mat){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                   System.out.print (mat[i][j][k]+" ") ;
                }
                System.out.println();
            }
            System.out.println();
        }    
}


}
