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
       
        while(statusPrograma==true){
            System.out.println("");
            System.out.println("***Menu de Opciones***");
            System.out.println("1.Piramide "+"\n2.Clave"+"\n3.Juego Piedra, Papel y Tijera"+"\n4.Adivinar"+"\n5.Salir");
            System.out.println("");
            System.out.println("Porfavor seleccione una opción: ");
            int opcion=lea.nextInt();
            
            switch(opcion){
                
                case 1:
                    //Case para ejercicio de piramide
                    System.out.println("");
                    
                    boolean continuar5=false;
                    int filas=0;
                    
                    while(continuar5==false){
                        System.out.println("Ingrese la cantidad de filas para la pirámide: ");
                        
                        if(lea.hasNextInt()){
                            filas=lea.nextInt();
                            if(filas<=0){
                                System.out.println("");
                                System.out.println("Valor Invalido");
                                
                            }else if(filas>0){
                                continuar5=true;
                            }
                            
                        }else{
                            System.out.println("");
                            System.out.println("Valor Invalido.");
                            lea.next();
                        }
                         
                    }
                    
                    
                    int num=1;
                    
                    //Estructura para desarrollo de piramide
                    int i;
                    for(i=1; i<=filas; i++){
                        
                        int suma=0;
                        int posiciones;
                        
                        //Posicionamiento
                        for(posiciones=1; posiciones<=i; posiciones++){
                            System.out.print(num + " ");
                            suma+=num;
                            num+=2;
                        }
                        System.out.println(" = " + suma);
                        
                    }
                    
                    break;
                
                case 2:
                    //Case para seccion de ejercicio de clave
                         System.out.println("Introduzca una frase: ");
                        String frase= lea.next();
        
                        String inverted_abc="zyxwvutsrqponmlkjihgfedcba";
                        String abc="abcdefghijklmnopqrstuvwxyz";
        
                        int length1=frase.length();
                        int length2=inverted_abc.length();
                        int m;

                        //palabra general
                        for(m=0; m<=(length1-1);m++){
                            char letter1= abc.charAt(m);
                            char letter1L=Character.toLowerCase(letter1);
                            int pos1=abc.indexOf(letter1L);
                            char invertida=' ';

                            int j;
                            for(j=0; j<=(length2-1);j++){
                                char letter2=inverted_abc.charAt(j);
                                char letter2L= Character.toLowerCase(letter2);
                                int pos2= inverted_abc.indexOf(letter2L);
                                if(pos2==pos1){
                                    invertida=letter2L;
                                }


                            }
                            System.out.println(invertida); 
                    
                        }
                        break;
                
                case 3:
                    //Case para juego piedra papel o tijeras
                    
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
                        
                        String eleccionCompu=" ";
                            
                        //Asignacion de opcion a computadora
                        if(numCompu==0){
                            eleccionCompu="piedra";
                        }else if(numCompu==1){
                            eleccionCompu="papel";
                        }else if(numCompu==2){
                            eleccionCompu="tijeras";
                        }
                        
                        
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
                    //Case para ejercicio de adivinar
                    
                    Random numerorandom2= new Random();
                    
                    int numeroSecreto= numerorandom2.nextInt(100)+1;
                    
                    int intentos=1;
                    int conteo=0;
                    boolean continuar3=false;
                    while(continuar3==false){
                        conteo++;
                        int numerobusca=0;
                        boolean continuar4=false;
                        
                        //Ciclo while para validar el numero ingresado
                        while(continuar4==false){
                            System.out.println("");
                            System.out.println("Intente adivinar el numero: ");
                            if(lea.hasNextInt()){
                                numerobusca=lea.nextInt();
                                 if(numerobusca<=0){
                                        System.out.println("");
                                        System.out.println("Opcion invalida.");
                                        lea.next();
                                     }else if(numerobusca>0){
                                        continuar4=true;
                                     }
                            }else{
                                System.out.println("");
                                System.out.println("Opcion Invalida.");
                                lea.next();
                            }
                            
                           
                        }

                        if(numerobusca<numeroSecreto){
                            System.out.println("");
                            System.out.println("El numero es mayor al introducido");
                        }else if(numerobusca>numeroSecreto){
                            System.out.println("");
                            System.out.println("El numero es menor al introducido.");
                        }else if(numerobusca==numeroSecreto){
                            System.out.println("");
                            System.out.println("Felicidades. Se ha descubierto el numero secreto a los "+conteo+" intentos.");
                            continuar3=true;
                        }
                        
                        if(conteo==10){
                            System.out.println("");
                            System.out.println("Intentos agotados");
                            System.out.println("El numero generado fue: "+numeroSecreto);
                            continuar3=true;
                        }
                        
                    }
                    
                    
                    
                    
                    
                    break;
                    
                case 5:
                    System.out.println("Entra a case 5");
                    //salir
                    statusPrograma=false;
                    break;
                    
                default:
                    System.out.println("");
                    System.out.println("Valor Invalido.");
                    
            }//Fin de switch
            
       
            
        }
        
    }
}

