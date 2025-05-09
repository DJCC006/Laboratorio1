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
    
    
    int cantreves=0;
    int cantperfecto=0;
    int cantprimos=0;
    int cantvotaciones=0;
    
    
    while(status==true){
            
            Scanner lea= new Scanner(System.in);
            lea.useDelimiter("\n");
            
            System.out.println("****Menu****");
            System.out.println("1.Palabras Alreves"+"\n2.Numero Perfecto"+"\n3.Primos"+"\n4.Votaciones"+"\n5.Salir"+"\nPorfavor ingrese una opcion: ");
            int opcion=lea.nextInt();
            
   
                if(opcion==1){
                    
                    cantreves++;
                
                     boolean continuar=false;
                    
                    
                    //while(continuar=false){
                    System.out.println("\n Ingrese el numero de palabras a evaluar");
                    int numpalabras=lea.nextInt();
                    
                    
                    
                    //Variables generales
                    int lengthLargo=0;
                    String palabraLarga="";
                    String longwords="";
                    boolean firsttry=true;
                    int i;
                     for(i=1; i<=numpalabras; i++){
                        //Ingreso palabra
                        System.out.println("Ingrese palabra: ");
                        String palabra= lea.next();
                        int length=palabra.length();
                        
                        
                        //variables locales
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
                         System.out.println("");
                        
                         //Determinar palabra larga
                         
                        if(length>lengthLargo){
                            lengthLargo=length;
                            palabraLarga=basepalabraL;
                            Longreverse=basealrevesL;
                            
                            longwords= "Palabra mas larga es: "+palabra;
                            
                            if(firsttry==false){
                                if(palabraLarga.equals(Longreverse)){
                                longwords= longwords + "\nEs Palindromo";
                                }else{
                                longwords= longwords+"\nNo es Palindromo";
                                }
                            }else{
                                firsttry=false;
                            }
                            
                            
                            
                        }
                        
                        
                        //consideracion de palabra de igual longitud
                        if(firsttry==false){
                            if(length==lengthLargo){
                                longwords= longwords + "\nTambien es palabra larga: "+palabra;
                            if(basepalabraL.equals(basealrevesL)){
                                longwords= longwords+"\nEs Palindromo";
                            }else{
                                longwords= longwords+"\nNo es Palindromo";
                            }
                            
                         }
                        }else{
                            firsttry=false;
                        }
                        
                        
                        
                     }
                     
                     System.out.println("");
                     System.out.println(longwords);
                     System.out.println("");
                      
                    
                    
            }else if(opcion==2){
                
                cantperfecto++;
                //Desarrollo de numero perfecto
                
                    System.out.println("Ingrese un numero: ");
                    int num=lea.nextInt();
                    
                    int perfectsum=0;
                    
                    
                    //revision de divisores
                        int i;
                        for(i=1; i<num; i++){
                            int res=(num%i);
                            if(res==0){
                               
                                perfectsum=perfectsum+i;
                            }
                        }
                        
                        //Evaluacion de numero perfecto
              
                        if(perfectsum==num){
                            System.out.println("");
                            System.out.println("El numero es perfecto");
                        }else{
                            System.out.println("");
                            System.out.println("El numero no es perfecto");
                        }
                    
                    
                    
            }else if(opcion==3){
                
                
                cantprimos++;
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
                
                
                //print de numero si es primo
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
                
                
                
                cantvotaciones++;
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
                
                //procesos
                double porcentaje=(totalVotos*0.60);
                
                if(votosValidos>porcentaje){
                    System.out.println("La planilla ganadora es la "+ganador+" con "+cantidadganador+" votos");
                }else{
                    System.out.println("VOTACION FALLIDA");
                    System.out.println("");
                }
                
                
                
                
                
                
                
                
            }else if(opcion==5){
                
                //prints de salida
                    System.out.println("");
                    System.out.println("***Conteos de apertura***");
                    System.out.println("1.Palabras alreves: "+cantreves);
                    System.out.println("2.Numero Perfecto: "+cantperfecto);
                    System.out.println("3.Primos: "+cantprimos);
                    System.out.println("4.Votaciones: "+cantvotaciones);
                status=false;
            }
                
                
                                
           
                                
     
                
            }
            
    }
            
 }
 

    

