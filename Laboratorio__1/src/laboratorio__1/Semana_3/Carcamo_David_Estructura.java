/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana_3;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author David
 */
public class Carcamo_David_Estructura {
    
    public static void main(String[] args){
        
    boolean status=true;
        
    while(status==true){
            
            Scanner lea= new Scanner(System.in);
            lea.useDelimiter("\n");
            
            System.out.println("****Menu****");
            System.out.println("1.Palabras Alreves"+"\n2.Numero Perfecto"+"\n3.Primos"+"\n4.Votaciones"+"\n5.Salir"+"\nPorfavor ingrese una opcion: ");
            int opcion=lea.nextInt();
            
   
                if(opcion==1){
                
                     boolean continuar=false;
                    
                    
                    //while(continuar=false){
                    System.out.println("\n Ingrese el numero de palabras a evaluar");
                    int numpalabras=lea.nextInt();
                    
                    int lengthLargo=0;
                    String palabraLarga="";
                    String almacenpalindromos="";
                    
                    String longwords="";
                    
                    int i;
                     for(i=1; i<=numpalabras; i++){
                        //Ingreso palabra
                        System.out.println("Ingrese palabra: ");
                        String palabra= lea.next();
                        int length=palabra.length();
                        
                        
                        //variables generales
                        String alreves="";
                        String basepalabra=palabra;
                        String basepalabraL= basepalabra.toLowerCase();
                        String basealreves="";
                        String Longreverse="";
                        
                        
                        //Ciclo de palabra alreves
                        int j;
                        for(j=(length-1);j>=0; j--){
                            char letra=palabra.charAt(j);
                            alreves= alreves + letra;
                            
                        }
                        basealreves=alreves;
                        String basealrevesL=basealreves.toLowerCase();
                        
                        
                         System.out.println("Alreves: "+alreves);
                        
                        if(length>lengthLargo){
                            lengthLargo=length;
                            palabraLarga=alreves;
                            Longreverse=basealrevesL;
                            
                            longwords= "Palabra mas larga es: "+palabraLarga;
                            
                            if(palabraLarga.equalsIgnoreCase(Longreverse)){
                                longwords= longwords + "\nEs Palindromo";
                            }
                            
                            
                            
                        }
                        
                        if(length==lengthLargo){
                            longwords= longwords + "\nTambien es palabra larga: "+palabra;
                            if(basepalabraL.equalsIgnoreCase(basealrevesL)){
                                longwords= longwords+"\nEs Palindromo";
                            }
                        }
                        
                        
                        
                     }
                     
                     System.out.println(longwords);
                      
                    
                    
            }else if(opcion==2){
                //Desarrollo de numero perfecto
                
                    System.out.println("Ingrese un numero: ");
                    int num=lea.nextInt();
                    
                    int perfectsum=0;
                    
                        int i;
                        for(i=1; i<num; i++){
                            int res=(num%i);
                            if(res==0){
                                //divisores=i;
                                perfectsum=perfectsum+i;
                            }
                        }
              
                        if(perfectsum==num){
                            System.out.println("");
                            System.out.println("El numero es perfecto");
                        }else{
                            System.out.println("");
                            System.out.println("El numero no es perfecto");
                        }
                    
                    
                    
            }else if(opcion==3){
                
                //Generacion de numero random
                Random random= new Random();
                int numeroRandom= random.nextInt(100-1)+1;
                
                System.out.println("");
                System.out.println("Numero generado: "+numeroRandom);
                
                //Determnador de si es primo
                int contador=0;
                int i;
                int qtydivisores=0;
                String listaenteros="***Lista de enteros***";
                for(i=1; i<=numeroRandom; i++){
                      int res=(numeroRandom%i);
                      if(res==0){
                        contador++;
                        
                      }
                         
                    }
                
                if(contador==2){
                    System.out.println("");
                    System.out.println("El numero "+numeroRandom+" es primo");
                }else{
                    System.out.println("");
                    System.out.println("El numero no es primo");
                }
                
                
                
                
                
                //Divisores enteros
              
                int j;
                for(j=1; j<numeroRandom; j++){
                    int res2=(numeroRandom%j);
                    if(res2==0){
                    qtydivisores++;
                    listaenteros=listaenteros +"\n"+j;
                }   
                }
                
                System.out.println("Este numero tiene "+qtydivisores+" divisores enteros");
                System.out.println(listaenteros);
                
                
                
            }else if(opcion==4){
                
                //Ingreso de votantes
                
                
                
                System.out.println("Ingrese la cantidad de votantes en el pais: ");
                int votantes=lea.nextInt();
                
                
   
                
                int votosAzul=0;
                int votosRojo=0;
                int votosNegro=0;
                int votosAmarillo=0;
                
                
                int totalVotos=0;
                int votosNulos=0;
                int votosValidos=0;
                String ganador="";
                int cantidadganador=0;
                //Ingreso de votos
                int i;
                for(i=1; i<=votantes; i++){
                    System.out.println("");
                    System.out.println("Ingrese la planilla por la que desea votar: (AZUL, ROJO, NEGRO, AMARILLO)");
                    String planilla=lea.next();
                    String planillaL=planilla.toLowerCase();
                    
                 
                    
                    //Registro de votos
                    if(planillaL.equals("azul")){
                         votosAzul++;
                         totalVotos++;
                         votosValidos++;
                         
                         if(votosAzul>cantidadganador){
                             cantidadganador=votosAzul;
                             ganador="Planilla Azul";
                         }
                         
                         
                    }else if(planillaL.equals("rojo")){
                        votosRojo++;
                        totalVotos++;
                        votosValidos++;
                        
                           if(votosRojo>cantidadganador){
                             cantidadganador=votosRojo;
                             ganador="Planilla Roja";
                         }
                        
                    }else if(planillaL.equals("negro")){
                        votosNegro++;
                        totalVotos++;
                        votosValidos++;
                        
                           if(votosNegro>cantidadganador){
                             cantidadganador=votosNegro;
                             ganador="Planilla Negra";
                         }
                        
                    }else if(planillaL.equals("amarillo")){
                        votosAmarillo++;
                        totalVotos++;
                        votosValidos++;
                        
                           if(votosAmarillo>cantidadganador){
                             cantidadganador=votosAmarillo;
                             ganador="Planilla Amarilla";
                         }
                        
                    }else{
                        votosNulos++;
                        totalVotos++;
                    }
                    
                }
                
                double promedio=(totalVotos*0.60);
                
                if(votosValidos>promedio){
                    System.out.println("La planilla ganadora es la "+ganador+" con "+cantidadganador+" votos");
                }else{
                    System.out.println("VOTACION FALLIDA");
                    System.out.println("");
                }
                
                
                
                
                
                
                
                
            }else if(opcion==5){
                status=false;
            }
                
                
                                
           
                                
     
                
            }
            
    }
            
 }
 

    

