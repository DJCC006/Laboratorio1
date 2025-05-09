/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana_3;
import java.util.Scanner;


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
                
            }else if(opcion==4){
                
            }else if(opcion==5){
                status=false;
            }
                
                
                                
           
                                
     
                
            }
            
    }
            
 }
 

    

