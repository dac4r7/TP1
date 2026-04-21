/*
 ENUNCIADO
Ejercicio 6
Escribe un programa que calcule la suma de todos los números múltiplos de 5 comprendidos entre
dos enteros positivos leídos por teclado

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int numero1,numero2;
        
        System.out.println("Ingrese dos numeros positivos a continuacion");
        System.out.print("Ingrese primer numero : ");
        numero1 = dato.nextInt();
        System.out.println("");
        System.out.print("Ingrese segundo numero : ");
        numero2 = dato.nextInt();
        
        calcularMul(numero1, numero2);
    }
    
    static void calcularMul(int num1, int num2){
        int c=1;
        System.out.println("Los numero multiplos de 5 comprendidos entre " +num1+ " y "+ num2 +" son:");
        
        for( int i = num1+1; i< num2 ; i++ ){
        
            if( i% 5 ==0 ){
                System.out.print(" "+ i+ " ");   
            c++;
            }
            if(c>20){          //para acomodar 20 resultados por linea
                System.out.println("");
                c=1;
            }
            }
    }
    
}
