/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana_5;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author David
 */
public class Carcamo_David_Exam1 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        boolean statusPrograma=true;
        System.out.println("***Menu de Opciones***");
        System.out.println("1.Piramide "+"\n2.Clave"+"\n3.Juego Piedra, Papel y Tijera"+"\n4.Adivinar"+"\n5.Salir");
        
        
        
        
        while(statusPrograma==true){
            System.out.println("");
            System.out.println("Porfavor seleccione una opción: ");
            int opcion=lea.nextInt();
            
            switch(opcion){
                
                case 1:
                    //Ejercicio piramide
                    System.out.println("");
                    
                    //Validacion aqui
                    System.out.println("Ingrese la cantidad de filas para la pirámide: ");
                    int filas=lea.nextInt();
                    
                    
                    
                    
                    
                    //Estructura para desarrollo de piramide
                    int i;
                    for(i=1; i<=filas; i++){
                        System.out.println("");
                        int posiciones;
                        int suma=0;
                        for(posiciones=1; posiciones<=i; posiciones++){
                            int num=posiciones;
                            System.out.print(num);
                            num+=2;
                            suma+=num;
                            System.out.print(num);
                            
                        }
                        
                        
                    }
                    
                    
                    
                    
                    break;
                
                case 2:
                    //ejercicio clave
                    System.out.println("Entra a case 2");
                    
                    
                    break;
                
                case 3:
                    
                    System.out.println("****Bienvenido A Piedra Papel o Tijeras****");
                    boolean gamestatus=true;
                            
                    Random numerorandom= new Random();
                    while(gamestatus==true){
                        
                        boolean confirmacion=false;
                        String seleccionL="";
                        
                        //Confirmacion de ingreso usuario
                        while(confirmacion==false){
                            System.out.println("Ingrese una opcion (piedra, papel, tijeras): ");
                            String seleccion=lea.next();
                            seleccionL=seleccion.toLowerCase();
                            if(seleccionL.equalsIgnoreCase("piedra")|| seleccionL.equalsIgnoreCase("papel")||seleccionL.equalsIgnoreCase("tijeras")){
                                confirmacion=true;
                            }else{
                                System.out.println("");
                                System.out.println("Opcion Invalida.");
                            }
                        }
                    
                        int numCompu= numerorandom.nextInt(3);
                        
                        System.out.println(numCompu);
                        String eleccionCompu=" ";
                            
                        //Asignacion de opcion a computadora
                        if(numCompu==0){
                            eleccionCompu="piedra";
                        }else if(numCompu==1){
                            eleccionCompu="papel";
                        }else if(numCompu==2){
                            eleccionCompu="tijeras";
                        }
                        
                        System.out.println(eleccionCompu);
                        
                        //Comprobacion de ganador
                        if(eleccionCompu.equalsIgnoreCase("piedra")&&seleccionL.equalsIgnoreCase("tijeras")){
                            System.out.println("");
                            System.out.println("Lo lamento bro. La compu ganó :(");
                        }else if(eleccionCompu.equalsIgnoreCase("papel")&&seleccionL.equalsIgnoreCase("piedra")){
                            System.out.println("");
                            System.out.println("Lo lamento bro. La compu ganó :(");
                                
                        }else if(eleccionCompu.equalsIgnoreCase("tijeras")&&seleccionL.equalsIgnoreCase("papel")){
                            System.out.println("");
                            System.out.println("Lo lamento bro. La compu ganó :(");
                                
                        }else if(eleccionCompu.equalsIgnoreCase("piedra")&&seleccionL.equalsIgnoreCase("piedra") || eleccionCompu.equalsIgnoreCase("papel")&&seleccionL.equalsIgnoreCase("papel") || eleccionCompu.equalsIgnoreCase("tijeras")&&eleccionCompu.equalsIgnoreCase("tijeras")){
                            System.out.println("");
                            System.out.println("Eso fue un empate. Epico.");
                        }
                        else{
                            System.out.println("");
                            System.out.println("Felicidades bro. Ganaste");
                        }
                            
                        //Pregunta para volver a jugar
                            
                        boolean confirmacion2=false;
                        while(confirmacion2==false){
                            System.out.println("¿Desea volver a jugar? (Si/No)");
                            String decision=lea.next().toLowerCase();
                            
                            if(decision.equalsIgnoreCase("no") || decision.equalsIgnoreCase("n")){
                                gamestatus=false;
                                confirmacion2=true;
                            }else if(decision.equalsIgnoreCase("si") || decision.equalsIgnoreCase("s")){
                                confirmacion2=true;
                                
                            }else{
                                System.out.println("");
                                System.out.println("Opcion Invalida");
                            }
                            
    
                        }
                        
                        
                        
                        
                    }
                    
                    
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
