/*
ENUNCIADO
Ejercicio3
Escribe un programa que calcule el factorial de n donde n es un número entero mayor o igual que
cero dado por el usuario.

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        double lectura,factorial;
        
        System.out.println("Ingrese un numero para calcular su factorial a continuacion :");
        lectura = dato.nextInt();
        
        calcularFactorial(lectura);
        
    }
    
    static void calcularFactorial(double numero){
       
        int i ;
        double factorial=1;
        for(i=1 ; i < numero+1 ; i++){
            
            factorial *= i;
        }
        
        System.out.println("El factorial del numero es : "+ factorial);
    }
}
