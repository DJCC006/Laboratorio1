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
public class Carcamo_David_Fecha {
    public static void main(String[] args){
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        //Lectura de fechas
        System.out.println("Porfavor ingrese la primer fecha en el formato Dia/Mes/Año: ");
        String fechaone=lea.next();
        System.out.println("Porfavor ingrese la segunda fecha en el formato Dia/Mes/Año: ");
        String fechatwo=lea.next();
        
        //Reconocimiento de fechas
        
        int dias=0;
        int meses=0;
        
        String posfechaone= fechaone.substring(fechaone.length() -4);
        String posfechatwo= fechatwo.substring(fechatwo.length()-4);
        
        int yearone=Integer.parseInt(posfechaone);
        int yeartwo=Integer.parseInt(fechatwo);
        
        int mayoryear=0;
        int minoryear=0;
        
        if(yearone>yeartwo){
            mayoryear=yearone;
            minoryear=yeartwo;
        }else{
            mayoryear=yeartwo;
            minoryear=yearone;
        }
        
        
        
        
           
        
        
    }
}
