/*
ENUNCIADO
Ejercicio 11
Escribe una aplicación que reciba como entrada un entero que contenga sólo dígitos 0 y 1 (es decir,
un entero binario), y que imprima su equivalente decimal. [Sugerencia: use los operadores residuo y
división para elegir los dígitos del número binario uno a la vez, de derecha a izquierda. En el
sistema numérico binario, el dígito más a la derecha tiene un valor posicional de 1, el siguiente
dígito a la izquierda tiene un valor posicional de 2, luego 4, luego 8, etcétera. El equivalente
decimal del número binario 1101 es 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 = 13].

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        
      Scanner dato = new Scanner(System.in); 
      int entrada,resto,numDecimal=0, decimales, i;
      
      System.out.print(" Ingrese a continuacion un numero que contenga solo digitos 0 y 1 --> ");
      entrada = dato.nextInt();
     
      //entrada = Math.abs(entrada);
      
      decimales= contarDecimales(entrada);
      
        System.out.print(" EL Equivalente en decimal del numero " + entrada +" = " );
      for( i = 0 ; i < decimales ; i++){
      
         resto = entrada%10;                     //separo el resto
         numDecimal += Math.pow(2, i) * resto ;  //suma parcial mienras se recorre el numero
         entrada = entrada/10;                   //corre decimal
      }
        System.out.print(" "+ numDecimal);
      }
    
    //obtengo ka cantidad de decimales que tiene el numero
    static int contarDecimales( int numero ){ 
     int div, cont=1;
     
      div = numero/10;
      while( div >0 ){  
      cont++; 
      numero = div;
      div = numero/10;    
     }
   
       return cont;   
      }

}