/*
ENUNCIADO
Ejercicio 8
Escribe un programa que ingrese un número entero positivo N y luego N números enteros e
imprima la suma de los números que se encuentran entre el mayor de los N números leídos y el
menor de los N números leídos.

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
       Scanner dato = new Scanner(System.in);
       int i, numero, numeros[];
       
        System.out.print(" Ingrese un numero , que sera la cantidad numeros posteriores a ingresar--> ");
                   
        numero = dato.nextInt();
        numeros = new int[numero];
        
        for(i = 0 ; i< numero ; i++){
            System.out.println("Ingrese el numero "+ (i+1));
            numeros[i] = dato.nextInt();
        }
        
        imprimirSuma(numeros);
    }
    
    static void imprimirSuma(int [ ]numeros){
        
        int j, i=0, mayor=0, menor = numeros[mayor];
        int numSuma=0 ;
      
        for(int num : numeros ){
           if(num > mayor){
                mayor= num;
            }
            if(num< menor ){
                menor = num;
            }    
            
        }
            for( j = 0 ; j< numeros.length; j++){
             if( numeros[j] < mayor && numeros[j] > menor ){
                
                numSuma += numeros[j];
            }
        }
        
        System.out.println("El numero mayor fue : " + mayor);
        System.out.println("El numero menor fue: "+ menor);
        System.out.println("La suma de los numeros entre el mayor y el menor ingresados fue :" +numSuma);
        
    }
    
}
