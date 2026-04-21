package prog.tp1;

import java.util.Scanner;

/*
ENUNCIADO
Ejercicio 1
Escribe un programa que tome 3 números enteros introducidos por el usuario mediante el teclado y
determine cuántos de dichos números son diferentes, el promedio, la suma de todos, el producto del
mayor por el menor y si el número restante es divisible por 3.
/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       
        int num1,num2,num3 ;
       
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero a continuacion");
        num1 = lectura.nextInt();
         System.out.println("Ingrese el segundo numero a continuacion");
        num2 = lectura.nextInt();
         System.out.println("Ingrese el tercer numero a continuacion");
        num3 = lectura.nextInt();
        
        sonDiferentes(num1,num2,num3);
        promedio(num1,num2,num3);
        suma(num1,num2,num3);
        prodmnDiv(num1,num2,num3);
    }
    
    public static void sonDiferentes(int n1,int n2, int n3){
       int dif=0;
        if(n1 != n2 ){
            if(n1 != n3){
                if(n2 != n3) 
                System.out.println("Los tres numeros Son diferentes");
               }else{
                System.out.println("un numero es diferente");
                }
             }else{
                   if(n2 != n3){
                      System.out.println("un numero es diferente");  
                   }else{
                     System.out.println("Los tres numeros son iguales, ninguno es diferente");  
                   }     
        }
    }
    
    public static void promedio(int n1 , int n2 , int n3){
        int prom = (n1 + n2 + n3)/3;
        
        System.out.println("El promedio es "+ prom);
    }
    
    public static void suma(int n1, int n2 , int n3){
        int suma = n1+ n2+ n3;
        System.out.println("La suma es " + suma);
    }
    
    public static void prodmnDiv(int n1,int n2, int n3){
        int  aux;
        int mayor,menor,restante;

        if( n1 > n2){
         if(n1>n3){
                  mayor = n1;
                   if(n3>n2){
                      menor=n2;
                      restante=n3;
                    }else{
                      menor=n3;
                      restante=n2;
                        }
               }else{
                    mayor=n3;
                    menor=n2;
                    restante=n1;
                    }              
        }else if(n2 > n3){
               mayor=n2;
                if(n3>n1){
                      menor=n1;
                      restante=n3;
                 }else{
                       menor=n3;
                       restante=n1;
                      }
                }else{
                    mayor=n3;
                    menor=n1;
                    restante=n2;
                    }
        System.out.println("El producto del mayor X menor es : "+ mayor*menor );
        if(restante%3 ==0){
              System.out.println("El numero restante es divisible por 3");  
        }else{  
            System.out.println("El numero restante no es divisible por 3");
        }
    
    }
    
    /* //version reducida usando la libreria Math
    public static void prodmnDiv(int n1,int n2, int n3){
    
    int mayor = Math.max(n1 , Math.max(n2,n3));
    int menor = Math.min(n1 , Math.min(n2,n3));
    
    int restante = n1 + n2 + n3 - mayor - menor;
    
     System.out.println("El producto del mayor * menor es : "+ mayor*menor );
        if(restante%3 ==0){
              System.out.println("El numero restante es divisible por 3");  
        }else{  
            System.out.println("El numero restante no es divisible por 3");
        }   
    }
    
    */
        
}
