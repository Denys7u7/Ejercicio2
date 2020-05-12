/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author denny
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra, palabra2;
        
        Scanner tc = new Scanner(System.in);
        
        palabra = tc.next();
        palabra = palabra.replace(" ","");
        palabra2 = new StringBuilder(palabra).reverse().toString();
        palabra2 = palabra2.replace(" ","");
        System.out.println(palabra + " " + palabra2);
        if(palabra == palabra2){
            System.out.println("No es un palíndromo");
        } else{
            System.out.println("Si es un palindromo");
        }
    }
}
