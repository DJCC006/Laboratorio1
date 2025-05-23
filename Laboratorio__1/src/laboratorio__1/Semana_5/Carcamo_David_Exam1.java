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
                    
                    int num=1;
                    
                    //Estructura para desarrollo de piramide
                    int i;
                    for(i=1; i<=filas; i++){
                        
                        int suma=0;
                        int posiciones;
                        
                        for(posiciones=1; posiciones<=i; posiciones++){
                            System.out.print(num + " ");
                            suma+=num;
                            num+=2;
                        }
                        System.out.println(" = " + suma);
                        
                    }
                    
                    
                    
                    
                    break;
                
                case 2:
                    //ejercicio clave
                    System.out.println("");
                    System.out.println("Elija una opcion: ");
                    System.out.println("1.Cifrar"+"\n2.Descrifar");
                    int opcion2=lea.nextInt();
                    
                    String group1="abcdefghijklm";
                    String group2="zyxwvutsrqpon";
                    String abecedario="abcdefghijklmnopqrstuvwxyz";
                    
                    
                    switch(opcion2){
                        case 1:
                            System.out.println("");
                            System.out.println("Ingrese mensaje a crifrar: ");
                            String mensaje=lea.next();
                            
                            int length=mensaje.length();
                            
                            int k;
                            int lengthabc=abecedario.length();
                            for(k=0; k<=(length-1);k++){
                                System.out.println("entra aqui");
                                char letra= mensaje.charAt(k);
                                
                                int l;
                                char letraopuesta=' ';
                                
                                //Ubicacion abecedario general
                                
                                
                                
                                
                                for(l=0;l<=(lengthabc-1);l++){
                                    char letraprovisional=abecedario.charAt(l);
                                    
                                    int pos=0; 
                                    if(letraprovisional==letra){
                                            pos= abecedario.indexOf(l);
                                            int pos1=0;
                                            int pos2=0;

                                            //Ubicacion por subgrupos
                                            if(pos>=0 && pos<=13){
                                                int o;

                                                //Ubicarse en su grupo incial
                                                int lengthgroup1= group1.length();
                                                for(o=0; o<=(lengthgroup1-1);o++){
                                                    char letrag1=group1.charAt(o);
                                                    if(letrag1==letra){
                                                        pos1=group1.indexOf(o);
                                                    }

                                                }

                                                //ubicarse en su grupo alterno
                                                int lengthgroup2=group2.length();
                                                for(o=0; o<=(lengthgroup2-1);o++){
                                                    int pos3=group2.indexOf(o);
                                                    if(pos3==pos1){
                                                        letraopuesta=group2.charAt(o);
                                                        System.out.println(letraopuesta);
                                                    }   

                                                }
                                            }else if(pos>=14 && pos<=26){
                                                int o;
                                                int lengthgroup2= group2.length();
                                                for(o=0; o<(lengthgroup2-1);o++){
                                                    char letrag2=group2.charAt(o);
                                                    if(letrag2==letra){
                                                        pos1=group2.indexOf(o);
                                                    }


                                                //ubicarse en su grupo alterno
                                                int lengthgroup1=group1.length();
                                                for(o=0; o<=(lengthgroup1-1);o++){
                                                    int pos3=group1.indexOf(o);
                                                    if(pos3==pos1){
                                                        letraopuesta=group1.charAt(o);
                                                        System.out.println(letraopuesta);
                                                    }

                                                    }

                                                }



                                                }
                                
                                    }
                                }
                                
                                
                                
                                System.out.println(letraopuesta);
                            
                   }
                            break;
                            
                case 2:
                            break;
                            
                        default:
                    }
                    
                    
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
                    
                    Random numerorandom2= new Random();
                    
                    int numeroSecreto= numerorandom2.nextInt(100)+1;
                    
                    int intentos=1;
                    int conteo=0;
                    boolean continuar3=false;
                    while(continuar3==false){
                        conteo++;
                        System.out.println("");
                        System.out.println("Intente adivinar el numero: ");
                        int numerobusca=lea.nextInt();
                        
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

