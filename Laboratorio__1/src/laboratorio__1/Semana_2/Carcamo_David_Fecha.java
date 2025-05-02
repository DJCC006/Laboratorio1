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
        System.out.println("Porfavor ingrese la primer fecha (menor) en el formato Dia/Mes/Año: ");
        String fechaone=lea.next();
        System.out.println("Porfavor ingrese la segunda fecha (mayor) en el formato Dia/Mes/Año: ");
        String fechatwo=lea.next();
        
        
        
        //Reconocimiento de fechas
        String posfechaone= fechaone.substring(6,10);
        String posfechatwo= fechatwo.substring(6,10);
        
        int yearone=Integer.parseInt(posfechaone);
        int yeartwo=Integer.parseInt(posfechatwo);
        
        
        String posmesone= fechaone.substring(4,5);
        String posmestwo= fechatwo.substring(4,5);
        
        int firstmes= Integer.parseInt(posmesone);
        int secondmes= Integer.parseInt(posmestwo);
        
        String posdaysone= fechaone.substring(1,2);
        String posdaystwo= fechatwo.substring(1,2);
        
        int firstdays= Integer.parseInt(posdaysone);
        int secondays= Integer.parseInt(posdaystwo);
        
        
        //calculos
        int totalDaysone=((yearone*360)+(firstmes*30)+firstdays);
        int totalDaystwo= ((yeartwo*360)+(secondmes*30)+secondays);
        
        int defdays= totalDaystwo-totalDaysone;
        
        //print
        System.out.println("La diferencia de dias es: "+defdays);

                
        
           
        
        
    }
}
