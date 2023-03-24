/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.

 */
package ejercicios1;

import java.util.Scanner;

public class notas {
//---------------------------------------------------
    public static void main(String[] args) {
        float suma = 0;
        Scanner leer = new Scanner(System.in);
        float[] prom = new float[2];//promedios

//---leo las 4 notas 10 veces 
        for (int i = 0; i <= 1; i++) {
            suma = Leo();
            prom[i] = suma;
        }
//---------------      fin llenar vector prom --------------------
      Mues(prom);  
        
        
        
        
    }
//---------------------------------------

    public static float Leo() {//leo cuatro notas 
        Scanner leer = new Scanner(System.in);

        float nota = 0;
        float suma = 0;
        System.out.println("T Practico 1 = ");
        nota = leer.nextFloat();
        suma += nota * .1;

        System.out.println("T Practico 2 = ");
        nota = leer.nextFloat();
        suma += nota * .15;

        System.out.println("Integrador  1 = ");
        nota = leer.nextFloat();
        suma += nota * .25;

        System.out.println("Integrador  2 = ");
        nota = leer.nextFloat();
        suma += nota * .50;
//        System.out.println(suma);
        return suma;

    }
//---------------------------------
public static void Mues(float[]prom){
    
  for (int i = 0; i <= 1 ; i++){
      System.out.print(prom[i]+" ");
  }  
    
}
   
//----------------------------------






//-------------------------------------------------------------------
}
