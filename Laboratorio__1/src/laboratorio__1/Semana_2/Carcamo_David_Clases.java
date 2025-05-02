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
public class Carcamo_David_Clases {
    

    
    public static void main(String[] args){
        System.out.println("Porfavor ingrese los datos de la fecha en donde desea realizar la observacion bajo el siguiente formato:"
                + "[dia] (texto),DD (nuemro)/MM (nuemro)]:  ");
        
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        String ingresoFecha= lea.next();
        String entrada= ingresoFecha.toLowerCase();
        
        
        
        int diaInt;
        int mesInt;
        
        //Extraccion del dia
        if(entrada.startsWith("[") && entrada.contains("],") && entrada.contains("/")){
            int finBracket= entrada.indexOf("],");
            String posdia= entrada.substring(1,finBracket);
            
            //Extraccion de la parte numerica
            String diasandmes = entrada.substring(finBracket + 2).trim();
            
            int Slash=diasandmes.indexOf("/");
            
            if(Slash != -1){
                String diaStr = diasandmes.substring(0,Slash).trim();
                String mesStr = diasandmes.substring(Slash + 1).trim();
                
                diaInt = Integer.parseInt(diaStr);
                mesInt = Integer.parseInt(mesStr);
                
                if(mesInt >= 1 && mesInt <= 12 && diaInt>=1 && diaInt <=31){
                    System.out.println("Fecha Ingresada Correctamente");
                    System.out.println("dia: "+posdia);
                    System.out.println("dia del mes: "+diaInt);
                    System.out.println("mes: "+mesInt);
                }else{
                    System.out.println("ERROR Dia o mes fuera del rango");
                }
            }else{
                System.out.println("ERROR formato dd/m invalido");
            }
        }else{
            System.out.println("ERROR: formato inicial invalido");
        }
      
        
        //Validacion de examenes
        
        int finBracket= entrada.indexOf("],");
        String validaciondia= entrada.substring(1,finBracket);
        if(validaciondia.equals("lunes") || validaciondia.equals("martes") || validaciondia.equals("miercoles")){
            System.out.println("¿Se realiaron examenes durante este dia? (Y/N): ");
            String decision= lea.next();
            String decisionLower=decision.toLowerCase();
            
            if(decisionLower.equals("y")){
                System.out.println("Ingrese el total de alumnos aprobados: ");
                int aprobados=lea.nextInt();
                System.out.println("Ingrese el total de alumnos reprobados: ");
                double reprobados=lea.nextInt();
                double totalalumnos=aprobados+reprobados;
                double porcentajeaprobados=(aprobados/(totalalumnos))*100;
                System.out.println("El procentaje de aprobados fue de: "+porcentajeaprobados);
            }else{
                System.out.println("Fin de proceso");
            }
            
        }else{
            System.out.println("No se pueden hacer examenes durante estas fechas");
        }
        
        //Validacion de jueves
        if(validaciondia.equals("jueves")){
            System.out.println("Ingrese el procengaje de asistencia a clase: ");
            double asistencia= lea.nextDouble();
            
            if(asistencia>50){
                System.out.println("Asistio la mayoria");
            }else{
                System.out.println("No asistio la mayoria");
            }
        }
        
        //Validacion viernes
        String diasandmes = entrada.substring(finBracket + 2).trim();    
        int Slash=diasandmes.indexOf("/");
        String diaStr = diasandmes.substring(0,Slash).trim();
        String mesStr = diasandmes.substring(Slash + 1).trim();
                
        diaInt = Integer.parseInt(diaStr);
        mesInt = Integer.parseInt(mesStr);
        
        if(validaciondia.equals("viernes")){
            if(diaInt==1 && mesInt ==1 || mesInt==7){
                System.out.println("");
                System.out.println("Comienzo de nuevo ciclo");
                System.out.println("Ingrese el total de alumnos matriculados: ");
                int cantalumnos= lea.nextInt();
                System.out.println("Ingrese el precio por alumno($): ");
                double precioxalumno= lea.nextDouble();
                double preciototal=precioxalumno*cantalumnos;
                System.out.println("***Detalles***");
                System.out.println("Cantidad alumnos: "+cantalumnos+"\nPrecio por alumno: $."+precioxalumno+"\nTotal: $."+preciototal);
                
                
            }
        }
     

    }
}
