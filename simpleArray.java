
/*
create an unideminsional array
 */
package ejercicios1; 
import java.util.Scanner ; 
public class simpleArray {
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

int[] patentes = {12,45,30};

System.out.println(patentes[0]);
String[] marcas= {"A","B","C"};

for (int i = 0; i<=2; i++){
System.out.print (marcas[i]+ " patente " +patentes[i] + " ");
}





    }
    //----------------fin main
    
}
