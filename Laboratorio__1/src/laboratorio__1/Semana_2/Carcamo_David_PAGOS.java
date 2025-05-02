/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana_2;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Carcamo_David_PAGOS {
    public static void main(String[] args){
        
        //Ingreso de Datos personales
        
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.println("Ingrese el codigo del empleado: ");
        int codigoEmpleado=lea.nextInt();
        System.out.println("Ingrese el primer nombre del empleado: ");
        String firstName= lea.next();
        System.out.println("Ingrese el primer apellido del empleado: ");
        String firstLastName= lea.next();
        System.out.println("Ingrese el total de horas trabajadas: ");
        int cantidadhoras=lea.nextInt();
        System.out.println("Ingrese la categoria correspondiente: ");
        int categoria= lea.nextInt();
        
        
       
        //Evaluacion con switch y ciclos ifs
        int horasExtra=0;
        double pagoExtra=0;
        double subtotal=0;
        if(cantidadhoras>40){
            horasExtra=cantidadhoras-40;
            if(horasExtra>15){
                switch(categoria){
                    case 1:
                        pagoExtra=40*15;
                        subtotal=35.99*40;
                        break;
                    case 2:
                        pagoExtra=50*15;
                        subtotal=35.99*40;
                        break;
                    case 3:
                        pagoExtra=85*15;
                        subtotal=35.99*40;
                        break;
                    case 4:
                        pagoExtra=0;
                        subtotal=35.99*40;
                        break;

                }
            }else{
                switch(categoria){
                    case 1:
                        pagoExtra=40*horasExtra;
                        subtotal=35.99*40;
                        break;
                    case 2:
                        pagoExtra=50*horasExtra;
                        subtotal=35.99*40;
                        break;
                    case 3:
                        pagoExtra=85*horasExtra;
                        subtotal=35.99*40;
                        break;
                    case 4:
                        pagoExtra=0;
                        subtotal=35.99*40;
                        break;
            }

            
        }
        
    }else{
            subtotal=35.99*cantidadhoras;
        }
      
        //Desarrollo de total
      double total = subtotal+pagoExtra;  
      String totalF= String.format("%.2f",total);
      
      //Seccion Impresion
        System.out.println("***Detalles de Pago***");
        System.out.println("Codigo de Empleado: "+codigoEmpleado+"\nNombre: "+firstName+"\nApellido: "+firstLastName+"\nHoras Trabajadas: "+cantidadhoras+"\n Categoria: "+categoria+"\nSueldo Total: "+totalF);
      
    }
        
}
