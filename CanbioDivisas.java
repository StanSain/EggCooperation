/*
Crea una aplicación que a través de una función nos convierta una cantidad
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor 
y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicios1;

import java.util.Scanner;

public class CanbioDivisas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float euros;
        String moneda;
        System.out.println("ingrese euros");
        euros = leer.nextFloat();
        System.out.println("ingrese moneda 'libras 1', '$ 2' 'yens 3' ");
        moneda = leer.next();
Cambio(euros,moneda);
    }
//------------------------------------------------ fin main

    public static void Cambio(float euros, String moneda) {
        float Convert;
        switch (moneda) {
            case "libras":
                Convert = (float) (euros * 0.86);
                System.out.println(Convert);
                break;
            case "$":
                Convert = (float) (euros * 1.28611);
                System.out.println(Convert);
                break;
            case "yens":
                Convert = (float) (euros * 129.852);
                System.out.println(Convert);
                break;
        }

    }
}
