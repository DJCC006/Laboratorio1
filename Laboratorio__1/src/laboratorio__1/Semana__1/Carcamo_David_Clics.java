/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio__1.Semana__1;

/**
 *
 * @author David
 */
public class Carcamo_David_Clics {
    public static void main(String[] args){
        int TotalClics=180;
        double ValorTotalClics= (60*0.30)+(100*0.25)+(20*0.80);
        double PromedioClics= ValorTotalClics/TotalClics;
        double ISV=PromedioClics*0.16;
        double TotalPrecio= PromedioClics + ISV;
        
        String PromedioClicsFormat= String.format("%.2f", PromedioClics);
        String ISVFormat= String.format("%.2f", ISV);
        String TotalPrecioFormat= String.format("%.2f",TotalPrecio);
        
        System.out.println("Promedio de clics: "+PromedioClicsFormat+"\nISV: "+ISVFormat+"\nTotal acumulado por los clics: "+TotalPrecioFormat);
        
        
        
    }
}
