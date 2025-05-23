/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana_5;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Carcamo_David_Exam1 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        boolean statusPrograma=true;
        
        while(statusPrograma==true){
            System.out.println("Porfavor seleccione una opción: ");
            int opcion=lea.nextInt();
            
            switch(opcion){
                
                case 1:
                    //Ejercicio piramide
                    System.out.println("Entra a case 1");
                    
                    break;
                
                case 2:
                    //ejercicio clave
                    System.out.println("Entra a case 2");
                    
                    
                    break;
                
                case 3:
                    //Ejercicio juego
                    System.out.println("Entra a case 3");
                    
                    
                    break;
                    
                case 4:
                    //ejercicio adivinar
                    System.out.println("Entra a case 4");
                    
                    
                    break;
                    
                case 5:
                    System.out.println("Entra a case 5");
                    //salir
                    statusPrograma=false;
                    break;
                    
                default:
                    System.out.println("Caso default");
                    
            }//Fin de switch
            
       
            
        }
        
    }
}
