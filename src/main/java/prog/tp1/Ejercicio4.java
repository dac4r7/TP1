/*
ENUCIADO
Ejercicio 4
Escribe un programa que escriba todos los divisores de un número n entero positivo introducido por
el usuario.

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
      Scanner ingreso = new Scanner(System.in);
      int numero, contador=1;
      int []divisores;
      
        System.out.print("Ingrese un numero positivo para hayar sus divisores -->  ");
        numero = ingreso.nextInt();
        
        hayarDiv(numero);
    }
    
    static void hayarDiv(int numero){
        
        int i, cont=0;
        
        System.out.print("Los divisores son : ");
        for(i =1 ; i< numero ; i++){
            if( numero %i ==0 ){
                System.out.print(" " + i );
            }
        }
        System.out.println(" " + numero );
    }
}
