/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana__1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Carcamo_David_Planilla_de_Empleado {
    public static void main(String[] args){
        //Parte de ingreso de Datos mediante teclado
        
        Scanner IngresoNombre= new Scanner(System.in);
        IngresoNombre.useDelimiter(";");
        System.out.println("Ingrese el nombre completo del empleado (porfavor incluya un ´;´ al final del nombre):");
        String NombreEmpleado= IngresoNombre.next();
        
        Scanner IngresoHoras = new Scanner(System.in);
        System.out.println("\n Ingrese el total de horas laboradas durante el mes");
        int HorasLaboradas= IngresoHoras.nextInt();
   
        
        Scanner IngresoTarifa = new Scanner(System.in);
        System.out.println("\n Ingrese el valor de la tarifa por hora");
        double TarifaxHora = IngresoTarifa.nextDouble();
        
        //Parte de desarrollo de proceso
        double SalarioSemanal= (HorasLaboradas*TarifaxHora)/4;
        
        //Parte de Impresión 
        System.out.println("-----Boleta del Empleado-----");
        System.out.println("Nombre del Empleado: "+NombreEmpleado+"\nHora de Trabajo Mensual: "+HorasLaboradas+"\nTarifa por Hora: "+TarifaxHora+
                "\n Salario del Empleado Semanal: Lps. "+SalarioSemanal);
        
    }
}
