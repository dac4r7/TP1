/*
ENUNCIADO
Ejercicio 9
Escribe una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro de la circunferencia y el área del círculo mediante el uso del valor de punto flotante
3.14159 para PI. También puede utilizar la constante predefinida Math.PI para el valor. Esta
constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las
clases en este paquete se importan de manera automática, por lo que no necesita importar la clase
Math mediante la instrucción import para usarla. Use las siguientes fórmulas (r es el radio):
diámetro = 2 r
circunferencia = 2 * PI * r
área = PI * r2


 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        int radio;
        System.out.print(" Ingrese un valor para el radio de un circulo -->  ");
        radio = numero.nextInt();
        
        calcular(radio);
        
    }
    
    static void calcular(int radio){
        
        int diametro = 2*radio;
        
        double area , perimetro;
        area = Math.PI * radio * radio ;
        perimetro = 2 * Math.PI * radio;
        
        System.out.println("El diametro del circulo es : "+ diametro);
        System.out.println("El perimetro del ciculo es : "+ perimetro);
        System.out.println("El area del circulo es " + area);
    }
}
