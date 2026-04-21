/*
 ENUNCIADO
Ejercicio2
Escribe un programa que tome un año introducido por el usuario y diga si es bisiesto o no. Recuerda
que los años múltiplos de 4 son bisiestos, excepto aquellos que son múltiplos de 100 y no lo son de
400. Es decir el año 2000 si es bisiesto, pero no lo son el 1990 ni el 2100.

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin 
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
   int numero;     
   Scanner dato = new Scanner(System.in);
      
    System.out.print("Ingrese un año para saber si es bisiesto o no  ---> ");
    numero = dato.nextInt();
    
    esBisiesto(numero);
    
    }
    
    static void esBisiesto(int numero){
      
        if( numero%4 == 0){
            if( numero%100 != 0 || numero%400 == 0){
                System.out.println("El año ingresado es Bisiesto");
            }else{
                System.out.println("El año ingresado no es Bisiesto");
            }
        }
        
    }
            
}
