package ejercicios1;
/*
escribir minuots y 
 */
//-----------              --------------------------------

import java.util.Scanner;
public class MilSeiscientosMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
float min;
System.out.println("ingrese minutos ");
min = leer.nextFloat();
int dias;
dias = (int)(min/3600);
int resto;
resto = (int)min%3600;

int horas;
horas = (int)resto/60;
int minRest ;
minRest = resto -horas*60;
System.out.println(dias + " " + horas + " " + minRest);
        



    }
    
}
