/*
ENUNCIADO 
Ejercicio 7
Escribe el programa para un juego que consista en averiguar un número. El programa nos indicará
cada vez si el número introducido es mayor o menor que la constante almacenada que tendremos
que averiguar. Cuando se descubre el numero mostrara un mensaje de felicitación.

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 * 
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
              
        int numero, numeroincognita;
        numeroincognita = numeroX();
        
        hayarNumX(numeroincognita);
        
    }
    
    static void hayarNumX(int numeroX){
         Scanner dato = new Scanner(System.in);
        int ingreso=-1;
        System.out.println("   ADIVINAR UN NUMERO  ");
        
        while(ingreso != numeroX){
          System.out.println(" Ingrese un numero ");
          ingreso = dato.nextInt();
          if(ingreso< numeroX){
              System.out.println("El numero ingresado es menor al numero a adivinar");
          }else if( ingreso> numeroX){
              System.out.println("El numero ingresado es mayor al numero a adivinar");
          }else if( ingreso == numeroX){
              System.out.println("FELICIDADES A ENCONTRADO EL NUMERO EL NUMERO ERA EL: " + ingreso );
          }
            
        }
        
       
    }
    
    static int numeroX(){      //generamos un numero aleatorio entre 0 y 10
        return (int)(Math.random()*10);
    }
    
}
