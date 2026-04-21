/*
Ejercicio 10
Escribe una aplicación que determine el sueldo bruto para cada uno de cinco empleados. La
empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de
la empresa, el número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada
empleado. Su programa debe recibir como entrada esta información para cada empleado, debe
determinar y mostrar el sueldo bruto de cada trabajador.

 */
package prog.tp1;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class Ejercicio10 {
    
    public static void main(String[] args) {
     
        Scanner dato = new Scanner(System.in);
        final int empleados = 5;
        int horasEmpleados[], tarifaEmpleados[], sueldoEmpleados[];
        horasEmpleados = new int[empleados];
        tarifaEmpleados = new int[empleados];
        sueldoEmpleados = new int[empleados];
        
        
        System.out.println("-----| CANTIDAD DE HORAS TRABAJADAS");
        for( int i = 0 ; i< empleados ; i++){
            System.out.println("Ingrese las horas trabajadas para el empleado -> "+ (i+1)+ "-> ");
            horasEmpleados[i] = dato.nextInt();
            
            System.out.println("Ingrese la tarifa por hora para el empleado -> "+ (i+1) + "-> ");
            tarifaEmpleados[i] = dato.nextInt();
          
         if(horasEmpleados[i] >40){
             sueldoEmpleados[i]= 40*tarifaEmpleados[i] + (horasEmpleados[i]-40 )*tarifaEmpleados[i]*3/2;
         }else if(horasEmpleados[i] <=40 ){
              sueldoEmpleados[i]= 40*tarifaEmpleados[i];
         }   
        }
        
        mostrarSueldoBruto( sueldoEmpleados);
        
    }
    
    static void mostrarSueldoBruto(int []sueldos){
        int i =0;
        System.out.println("LISTA DE SUELDOS");
         System.out.println("   Empleado  Sueldo Bruto");
        for(int sueldo : sueldos){
            System.out.println( "        " + i +"          "+sueldos[i] );
            i++;
        }
    }
    
}
