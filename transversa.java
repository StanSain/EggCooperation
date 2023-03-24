/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package ejercicios1;

public class transversa {

    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int[][] mat2 = new int[4][4];
        Inic(mat);
        Inic(mat2);
        Rell(mat);
        Tran(mat,mat2);
        Imp(mat);
        System.out.println();
        Imp(mat2);
    }
//-----------------------------------------------

    public static void Inic(int[][] mat) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                mat[i][j] = 0;
            }
        }
    }
//---------------------------------------

    public static void Rell(int[][] mat) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    //----------------------------
    public static void Tran(int[][]mat , int[][]mat2){
        

        for (int j = 0; j <= 3; j++) {
            for (int i = 0; i <= 3; i++) {
                mat2[i][j] = mat[j][i];
            }
            
        }
       
    }

    //----------------------------------------
    public static void Imp(int[][] mat) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
