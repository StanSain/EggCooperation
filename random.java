/*
Llenar vector con aleatorio
 */
package ejercicios1;

/**
 *
 * @author John
 */
public class random {

    public static void main(String[] args) {
        int[] vect = new int[3];

//        LLenaVect(vect);
//        MuestraVect(vect);
//----------------------------        
        
                double num;
num = Math.random()*10;
int num2;
num2 = (int) num;
System.out.println(num);
System.out.println(num2); 
        
        
        
    }
//------------------------------------------------
    public static void LLenaVect(int[] vect) {
        for (int i = 0; i <= 2; i++) {
            vect[i] = Math.round(i);
        }
    }
//---------------------
    public static void MuestraVect(int[]vect){
        for (int i = 0; i <= 2; i++) {
            System.out.print (vect[i]+ " ") ;
        }
    }
    
}
