/*
ENUNCIADO
Ejercicio 5
Escribe un programa que escriba la tabla de multiplicar de cualquier número entero dado por el
usuario, entre 1 y 10.

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 * 
 */
public class Ejercicio5 {
    
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        int numero; 
            
        do{
        System.out.print("Ingrese un numero del 1 al 10 --->  ");
        numero = ingreso.nextInt();
        }while(numero <1 || numero >10);
        
        crearTabla(numero);
        
    }
    
    static void crearTabla(int numero){
    int i;
        System.out.println("       TABLA DEL "+ numero);
        for(i=1; i < 11; i++){
            System.out.println("     " + i +" x " + numero +" = "+ i*numero);
            
        }
        
    }
    
    
}
