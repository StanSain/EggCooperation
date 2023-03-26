/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggcooperation;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra ="";
        String palabra1 = Valida();
//        String[] letra = new String[5];
        System.out.println(palabra1);
  
    }

    //----------------
    public static String Valida() {
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        System.out.println("ingrese palabra de entre tres y cinco caracteres");
        palabra = leer.next();
        int largo = palabra.length();
        while ((largo < 3) || (largo > 5)) {
            System.out.println("ingrese palabra de entre tres y cinco caracteres");
            palabra = leer.next();
             largo = palabra.length();
        }
        return palabra;
    }
    //---------------

    
    //--------------
}

