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
        System.out.println("Ingrese el nombre completo del empleado:");
        String NombreEmpleado= IngresoNombre.nextLine();
        
        Scanner IngresoHoras = new Scanner(System.in);
        System.out.println("\n Ingrese el total de horas laboradas durante el mes");
        int HorasLaboradas= IngresoHoras.nextInt();
        IngresoHoras.nextLine();
        
        Scanner IngresoTarifa = new Scanner(System.in);
        System.out.println("\n Ingrese el valor de la tarifa por hora");
        double TarifaxHora = IngresoTarifa.nextDouble();
        
        
    }
}
