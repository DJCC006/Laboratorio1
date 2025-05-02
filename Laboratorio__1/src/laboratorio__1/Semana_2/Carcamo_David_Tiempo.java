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
public class Carcamo_David_Tiempo {
    public static void main(String[] args){
        System.out.println("Ingrese la cantidad de segundos a convertir: ");
        
        Scanner lea= new Scanner(System.in);
        int ingreso=lea.nextInt();
        
        int horas= ingreso>0 ? ingreso/3600 : 0;
        
        int minutos= ingreso>0 ? ingreso/60 : 0;
        
        int segundos= ingreso>0 ? ingreso : 0;
        
        if (segundos==0 && horas==0 && minutos ==0){
            System.out.println("no se permite ese valor");
        }else{
            System.out.println("horas: "+horas+"\nminutos: "+minutos+"\nsegundos: "+segundos);
        }
        
        
        
    }
}
